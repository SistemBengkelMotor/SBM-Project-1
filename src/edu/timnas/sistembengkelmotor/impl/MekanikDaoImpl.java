/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Mekanik;
import edu.timnas.sistembengkelmotor.error.MekanikException;
import edu.timnas.sistembengkelmotor.service.MekanikDao;
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
public class MekanikDaoImpl implements MekanikDao{
    private Connection connection;
    
    public MekanikDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertMekanik = "INSERT INTO mekanik (namaMekanik) "
            + "VALUES (?)";
    private final String updateMekanik = "UPDATE mekanik SET namaMekanik=? "
            + "WHERE idMekanik=?";
    private final String deleteMekanik = "DELETE FROM mekanik WHERE idMekanik=?";
    private final String getById = "SELECT * FROM mekanik WHERE idMekanik=?";
    private final String getByNama = "SELECT * FROM mekanik WHERE namaMekanik=?";
    private final String selectAll = "SELECT * FROM mekanik";
    
    
    @Override
    public void insertMekanik(Mekanik mekanik) throws MekanikException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertMekanik);
            statement.setString(1, mekanik.getNamaMekanik());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MekanikException(e.getMessage());
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
    public void updateMekanik(Mekanik mekanik) throws MekanikException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateMekanik);
            statement.setString(1, mekanik.getNamaMekanik());
            statement.setInt(2, mekanik.getIdMekanik());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MekanikException(e.getMessage());
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
    public void deleteMekanik(Integer idMekanik) throws MekanikException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteMekanik);
            statement.setInt(1, idMekanik);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MekanikException(e.getMessage());
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
    public Mekanik getMekanik(Integer idMekanik) throws MekanikException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idMekanik);
            
            ResultSet result = statement.executeQuery();
            Mekanik mekanik = null;
            
            if (result.next()) {
                mekanik = new Mekanik();
                mekanik.setIdMekanik(result.getInt("idMekanik"));
                mekanik.setNamaMekanik(result.getString("namaMekanik"));
            }else{
                throw new MekanikException("Mekanik dengan id "+idMekanik+" tidak ditemukan");
            }
            
            connection.commit();
            
            return mekanik;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MekanikException(e.getMessage());
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
    public Mekanik getMekanik(String namaMekanik) throws MekanikException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNama);
            statement.setString(1, namaMekanik);
            
            ResultSet result = statement.executeQuery();
            Mekanik mekanik = null;
            
            if (result.next()) {
                mekanik = new Mekanik();
                mekanik.setIdMekanik(result.getInt("idMekanik"));
                mekanik.setNamaMekanik(result.getString("namaMekanik"));
            }else{
                throw new MekanikException("Mekanik dengan namaMekanik "+namaMekanik+" tidak ditemukan");
            }
            
            connection.commit();
            
            return mekanik;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MekanikException(e.getMessage());
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
    public List<Mekanik> selectAllMekanik() throws MekanikException {
        Statement statement = null;
        List<Mekanik> list = new ArrayList<Mekanik>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Mekanik mekanik = null;
            
            while (result.next()) {
                mekanik = new Mekanik();
                mekanik.setIdMekanik(result.getInt("idMekanik"));
                mekanik.setNamaMekanik(result.getString("namaMekanik"));
                list.add(mekanik);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MekanikException(e.getMessage());
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
