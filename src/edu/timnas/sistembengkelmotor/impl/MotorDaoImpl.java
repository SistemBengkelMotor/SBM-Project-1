/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Motor;
import edu.timnas.sistembengkelmotor.error.MotorException;
import edu.timnas.sistembengkelmotor.service.MotorDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public class MotorDaoImpl implements MotorDao{
    
    private Connection connection;
    
    public MotorDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertMotor = "INSERT INTO motor (nopol,idType) "
            + "VALUES (?,?)";
    private final String updateMotor = "UPDATE motor SET idType=? "
            + "WHERE nopol=?";
    private final String deleteMotor = "DELETE FROM motor WHERE nopol=?";
    private final String getById = "SELECT * FROM motor WHERE nopol=?";
    private final String getByNama = "SELECT * FROM motor WHERE idType=?";
    private final String selectAll = "SELECT * FROM motor";
    private final String selectAllComb = "SELECT mot.nopol, mrk.namaMerk, ty.jenisType "
            + "FROM merk as mrk, type as ty, motor as mot "
            + "WHERE mot.idType=ty.idType AND ty.idMerk=mrk.idMerk;"; //3atribut: nopol,namaMerk,JenisType
    

    @Override
    public void insertMotor(Motor motor) throws MotorException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertMotor);
            statement.setString(1, motor.getNopol());
            statement.setInt(2, motor.getIdType());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MotorException(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            // cek statement kosong atau tidak
            if (statement != null) {
               try {
                    statement.close();
                } catch (SQLException e) {
                
                } 
            }
        }
    }

    @Override
    public void updateMotor(Motor motor) throws MotorException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateMotor);
            statement.setInt(1, motor.getIdType());
            statement.setString(2, motor.getNopol());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MotorException(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            // cek statement kosong atau tidak
            if (statement != null) {
               try {
                    statement.close();
                } catch (SQLException e) {
                
                } 
            }
        }
    }

    @Override
    public void deleteMotor(String nopol) throws MotorException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteMotor);
            statement.setString(1, nopol);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MotorException(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            // cek statement kosong atau tidak
            if (statement != null) {
               try {
                    statement.close();
                } catch (SQLException e) {
                
                } 
            }
        }
    }

    @Override
    public Motor getMotor(String nopol) throws MotorException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setString(1, nopol);
            
            ResultSet result = statement.executeQuery();
            Motor motor = null;
            
            if (result.next()) {
                motor = new Motor();
                motor.setNopol(result.getString("nopol"));
                motor.setIdType(result.getInt("idType"));
            }else{
                throw new MotorException("Motor dengan id "+nopol+" tidak ditemukan");
            }
            
            connection.commit();
            
            return motor;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MotorException(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            // cek statement kosong atau tidak
            if (statement != null) {
               try {
                    statement.close();
                } catch (SQLException e) {
                
                } 
            }
        }
    }

    @Override
    public Motor getType(int idType) throws MotorException {
        return null; // fitur ini ditiadakan dulu
    }

    @Override
    public List<Motor> selectAllMotor() throws MotorException {
        Statement statement = null;
        List<Motor> list = new ArrayList<Motor>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Motor motor = null;
            
            while (result.next()) {
                motor = new Motor();
                motor.setNopol(result.getString("nopol"));
                motor.setIdType(result.getInt("idType"));
                list.add(motor);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MotorException(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            // cek statement kosong atau tidak
            if (statement != null) {
               try {
                    statement.close();
                } catch (SQLException e) {
                
                } 
            }
        }
    }

    @Override
    public List<Motor> selectAllCombMotor() throws MotorException {
        Statement statement = null;
        List<Motor> list = new ArrayList<Motor>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAllComb);
            Motor motor = null;
            
            while (result.next()) {
                motor = new Motor();
                motor.setNopol(result.getString("nopol"));
                motor.setNamaMerk(result.getString("namaMerk"));
                motor.setJenisType(result.getString("jenisType"));
                list.add(motor);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MotorException(e.getMessage());
        }finally{
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            // cek statement kosong atau tidak
            if (statement != null) {
               try {
                    statement.close();
                } catch (SQLException e) {
                
                } 
            }
        }
    }
    
}
