/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Jasa;
import edu.timnas.sistembengkelmotor.error.JasaException;
import edu.timnas.sistembengkelmotor.service.JasaDao;
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
public class JasaDaoImpl implements JasaDao{
    
    private Connection connection;

    public JasaDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertJasa = "INSERT INTO jasa (namaJasa) "
            + "VALUES (?)";
    private final String updateJasa = "UPDATE jasa SET namaJasa=? "
            + "WHERE idJasa=?";
    private final String deleteJasa = "DELETE FROM jasa WHERE idJasa=?";
    private final String getById = "SELECT * FROM jasa WHERE idJasa=?";
    private final String getByNama = "SELECT * FROM jasa WHERE namaJasa=?";
    private final String selectAll = "SELECT * FROM jasa";
    
    @Override
    public void insertJasa(Jasa jasa) throws JasaException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertJasa);
            statement.setString(1, jasa.getNamaJasa());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new JasaException(e.getMessage());
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
    public void updateJasa(Jasa jasa) throws JasaException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateJasa);
            statement.setString(1, jasa.getNamaJasa());
            statement.setInt(2, jasa.getIdJasa());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new JasaException(e.getMessage());
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
    public void deleteJasa(Integer idJasa) throws JasaException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteJasa);
            statement.setInt(1, idJasa);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new JasaException(e.getMessage());
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
    public Jasa getJasa(Integer idJasa) throws JasaException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idJasa);
            
            ResultSet result = statement.executeQuery();
            Jasa jasa = null;
            
            if (result.next()) {
                jasa = new Jasa();
                jasa.setIdJasa(result.getInt("idJasa"));
                jasa.setNamaJasa(result.getString("namaJasa"));
            }else{
                throw new JasaException("Jasa dengan id "+idJasa+" tidak ditemukan");
            }
            
            connection.commit();
            
            return jasa;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new JasaException(e.getMessage());
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
    public Jasa getJasa(String namaJasa) throws JasaException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNama);
            statement.setString(1, namaJasa);
            
            ResultSet result = statement.executeQuery();
            Jasa jasa = null;
            
            if (result.next()) {
                jasa = new Jasa();
                jasa.setIdJasa(result.getInt("idJasa"));
                jasa.setNamaJasa(result.getString("namaJasa"));
            }else{
                throw new JasaException("Jasa dengan namaJasa "+namaJasa+" tidak ditemukan");
            }
            
            connection.commit();
            
            return jasa;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new JasaException(e.getMessage());
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
    public List<Jasa> selectAllJasa() throws JasaException {
        Statement statement = null;
        List<Jasa> list = new ArrayList<Jasa>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Jasa jasa = null;
            
            while (result.next()) {
                jasa = new Jasa();
                jasa.setIdJasa(result.getInt("idJasa"));
                jasa.setNamaJasa(result.getString("namaJasa"));
                list.add(jasa);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new JasaException(e.getMessage());
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
