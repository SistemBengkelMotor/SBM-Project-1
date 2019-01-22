/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Pelanggan;
import edu.timnas.sistembengkelmotor.error.PelangganException;
import edu.timnas.sistembengkelmotor.service.PelangganDao;
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
public class PelangganDaoImpl implements PelangganDao{
    
    private Connection connection;
    
    public PelangganDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertPelanggan = "INSERT INTO pelanggan "
            + "(namaPelanggan, noTelp) "
            + "VALUES (?,?)";
    private final String updatePelanggan = "UPDATE pelanggan "
            + "SET namaPelanggan=?, noTelp=? "
            + "WHERE idPelanggan=?";
    private final String deletePelanggan = "DELETE FROM pelanggan WHERE idPelanggan=?";
    private final String getById = "SELECT * FROM pelanggan WHERE idPelanggan=?";
    private final String getByNama = "SELECT * FROM pelanggan WHERE namaPelanggan=?";
    private final String selectAll = "SELECT * FROM pelanggan";

    @Override
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertPelanggan);
            statement.setString(1, pelanggan.getNamaPelanggan());
            statement.setString(2, pelanggan.getNoTelp());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PelangganException(e.getMessage());
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
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updatePelanggan);
            statement.setString(1, pelanggan.getNamaPelanggan());
            statement.setString(2, pelanggan.getNoTelp());
            statement.setInt(3, pelanggan.getIdPelanggan());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PelangganException(e.getMessage());
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
    public void deletePelanggan(Integer idPelanggan) throws PelangganException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deletePelanggan);
            statement.setInt(1, idPelanggan);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PelangganException(e.getMessage());
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
    public Pelanggan getPelanggan(Integer idPelanggan) throws PelangganException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idPelanggan);
            
            ResultSet result = statement.executeQuery();
            Pelanggan pelanggan = null;
            
            if (result.next()) {
                pelanggan = new Pelanggan();
                pelanggan.setIdPelanggan(result.getInt("idPelanggan"));
                pelanggan.setNamaPelanggan(result.getString("namaPelanggan"));
                pelanggan.setNoTelp(result.getString("noTelp"));
            }else{
                throw new PelangganException("Pelanggan dengan id "+idPelanggan+" tidak ditemukan");
            }
            
            connection.commit();
            
            return pelanggan;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PelangganException(e.getMessage());
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
    public Pelanggan getPelanggan(String namaPelanggan) throws PelangganException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNama);
            statement.setString(1, namaPelanggan);
            
            ResultSet result = statement.executeQuery();
            Pelanggan pelanggan = null;
            
            if (result.next()) {
                pelanggan = new Pelanggan();
                pelanggan.setIdPelanggan(result.getInt("idPelanggan"));
                pelanggan.setNamaPelanggan(result.getString("namaPelanggan"));
                pelanggan.setNoTelp(result.getString("noTelp"));
            }else{
                throw new PelangganException("Pelanggan dengan namaPelanggan "+namaPelanggan+" tidak ditemukan");
            }
            
            connection.commit();
            
            return pelanggan;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PelangganException(e.getMessage());
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
    public List<Pelanggan> selectAllPelanggan() throws PelangganException {
        Statement statement = null;
        List<Pelanggan> list = new ArrayList<Pelanggan>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Pelanggan pelanggan = null;
            
            while (result.next()) {
                pelanggan = new Pelanggan();
                pelanggan.setIdPelanggan(result.getInt("idPelanggan"));
                pelanggan.setNamaPelanggan(result.getString("namaPelanggan"));
                pelanggan.setNoTelp(result.getString("noTelp"));
                list.add(pelanggan);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PelangganException(e.getMessage());
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
