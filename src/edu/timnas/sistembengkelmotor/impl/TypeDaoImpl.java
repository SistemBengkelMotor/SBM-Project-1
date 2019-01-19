/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Type;
import edu.timnas.sistembengkelmotor.error.TypeException;
import edu.timnas.sistembengkelmotor.service.TypeDao;
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
public class TypeDaoImpl implements TypeDao{
    
    private Connection connection;
    
    public TypeDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertType = "INSERT INTO type (idMerk,jenisType) "
            + "VALUES (?,?)";
    private final String updateType = "UPDATE type SET idMerk=?, jenisType=? "
            + "WHERE idType=?";
    private final String deleteType = "DELETE FROM type WHERE idType=?";
    private final String getById = "SELECT * FROM type WHERE idType=?";
    private final String getByNama = "SELECT * FROM type WHERE idMerk=?";
    private final String selectAll = "SELECT * FROM type";
    private final String selectAllComb = "SELECT t.idType, m.namaMerk, t.jenisType "
            + "FROM merk as m,type as t "
            + "WHERE t.idMerk=m.idMerk;";
    
    
    
    @Override
    public void insertType(Type type) throws TypeException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertType);
            statement.setInt(1, type.getIdMerk());
            statement.setString(2, type.getJenisType());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new TypeException(e.getMessage());
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
    public void updateType(Type type) throws TypeException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateType);
            statement.setInt(1, type.getIdMerk());
            statement.setString(2, type.getJenisType());
            statement.setInt(3, type.getIdType());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new TypeException(e.getMessage());
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
    public void deleteType(Integer idType) throws TypeException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteType);
            statement.setInt(1, idType);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new TypeException(e.getMessage());
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
    public Type getType(Integer idType) throws TypeException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idType);
            
            ResultSet result = statement.executeQuery();
            Type type = null;
            
            if (result.next()) {
                type = new Type();
                type.setIdType(result.getInt("idType"));
                type.setIdMerk(result.getInt("idMerk"));
                type.setJenisType(result.getString("jenisType"));
            }else{
                throw new TypeException("Type dengan id "+idType+" tidak ditemukan");
            }
            
            connection.commit();
            
            return type;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new TypeException(e.getMessage());
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
    public Type getMerk(int idMerk) throws TypeException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNama);
            statement.setInt(1, idMerk);
            
            ResultSet result = statement.executeQuery();
            Type type = null;
            
            if (result.next()) {
                type = new Type();
                type.setIdType(result.getInt("idType"));
                type.setIdMerk(result.getInt("idMerk"));
                type.setJenisType(result.getString("jenisType"));
            }else{
                throw new TypeException("Type dengan idMerk "+idMerk+" tidak ditemukan");
            }
            
            connection.commit();
            
            return type;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new TypeException(e.getMessage());
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
    public List<Type> selectAllType() throws TypeException {
        Statement statement = null;
        List<Type> list = new ArrayList<Type>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Type type = null;
            
            while (result.next()) {
                type = new Type();
                type.setIdType(result.getInt("idType"));
                type.setIdMerk(result.getInt("idMerk"));
                type.setJenisType(result.getString("jenisType"));
                list.add(type);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new TypeException(e.getMessage());
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
    public List<Type> selectAllCombType() throws TypeException {
        Statement statement = null;
        List<Type> list = new ArrayList<Type>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAllComb);
            Type type = null;
            
            while (result.next()) {
                type = new Type();
                type.setIdType(result.getInt("idType"));
                type.setIdMerk(result.getInt("idMerk"));
                type.setJenisType(result.getString("jenisType"));
                list.add(type);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new TypeException(e.getMessage());
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
