/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Rak;
import edu.timnas.sistembengkelmotor.error.RakException;
import edu.timnas.sistembengkelmotor.service.RakDao;
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
public class RakDaoImpl implements RakDao{
    
    private Connection connection;
    
    public RakDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertRak = "INSERT INTO rak (lokasi) "
            + "VALUES (?)";
    private final String updateRak = "UPDATE rak SET lokasi=? "
            + "WHERE idRak=?";
    private final String deleteRak = "DELETE FROM rak WHERE idRak=?";
    private final String getById = "SELECT * FROM rak WHERE idRak=?";
    private final String getByNama = "SELECT * FROM rak WHERE lokasi=?";
    private final String selectAll = "SELECT * FROM rak";
    
    
    @Override
    public void insertRak(Rak rak) throws RakException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertRak);
            statement.setString(1, rak.getLokasi());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new RakException(e.getMessage());
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
    public void updateRak(Rak rak) throws RakException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateRak);
            statement.setString(1, rak.getLokasi());
            statement.setInt(2, rak.getIdRak());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new RakException(e.getMessage());
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
    public void deleteRak(Integer idRak) throws RakException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteRak);
            statement.setInt(1, idRak);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new RakException(e.getMessage());
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
    public Rak getRak(Integer idRak) throws RakException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idRak);
            
            ResultSet result = statement.executeQuery();
            Rak rak = null;
            
            if (result.next()) {
                rak = new Rak();
                rak.setIdRak(result.getInt("idRak"));
                rak.setLokasi(result.getString("lokasi"));
            }else{
                throw new RakException("Rak dengan id "+idRak+" tidak ditemukan");
            }
            
            connection.commit();
            
            return rak;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new RakException(e.getMessage());
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
    public Rak getRak(String lokasi) throws RakException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNama);
            statement.setString(1, lokasi);
            
            ResultSet result = statement.executeQuery();
            Rak rak = null;
            
            if (result.next()) {
                rak = new Rak();
                rak.setIdRak(result.getInt("idRak"));
                rak.setLokasi(result.getString("lokasi"));
            }else{
                throw new RakException("Rak dengan lokasi "+lokasi+" tidak ditemukan");
            }
            
            connection.commit();
            
            return rak;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new RakException(e.getMessage());
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
    public List<Rak> selectAllRak() throws RakException {
        Statement statement = null;
        List<Rak> list = new ArrayList<Rak>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Rak rak = null;
            
            while (result.next()) {
                rak = new Rak();
                rak.setIdRak(result.getInt("idRak"));
                rak.setLokasi(result.getString("lokasi"));
                list.add(rak);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new RakException(e.getMessage());
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
