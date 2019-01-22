/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Pembelian;
import edu.timnas.sistembengkelmotor.error.PembelianException;
import edu.timnas.sistembengkelmotor.service.PembelianDao;
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
public class PembelianDaoImpl implements PembelianDao{

    private Connection connection;
    
    public PembelianDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertPembelian = "INSERT INTO pembelian "
            + "(idSupplier, tglPembelian, totalHargaBeli) "
            + "VALUES (?,?,?)";
    private final String updatePembelian = "UPDATE pembelian "
            + "SET idSupplier=?, tglPembelian=?, totalHargaBeli=? "
            + "WHERE idPembelian=?";
    private final String deletePembelian = "DELETE FROM pembelian WHERE idPembelian=?";
    private final String getById = "SELECT * FROM pembelian WHERE idPembelian=?";
    private final String getByNama = "SELECT * FROM pembelian WHERE namaPembelian=?";
    private final String selectAll = "SELECT * FROM pembelian";
    
    @Override
    public void insertPembelian(Pembelian pembelian) throws PembelianException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertPembelian);
            statement.setInt(1, pembelian.getIdSupplier());
            statement.setString(2, pembelian.getTglPembelian());
            statement.setInt(3, pembelian.getTotalHargaBeli());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PembelianException(e.getMessage());
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
    public void updatePembelian(Pembelian pembelian) throws PembelianException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updatePembelian);
             statement.setInt(1, pembelian.getIdSupplier());
            statement.setString(2, pembelian.getTglPembelian());
            statement.setInt(3, pembelian.getTotalHargaBeli());
            statement.setInt(4, pembelian.getIdPembelian());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PembelianException(e.getMessage());
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
    public void deletePembelian(Integer idPembelian) throws PembelianException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deletePembelian);
            statement.setInt(1, idPembelian);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PembelianException(e.getMessage());
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
    public Pembelian getPembelian(Integer idPembelian) throws PembelianException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idPembelian);
            
            ResultSet result = statement.executeQuery();
            Pembelian pembelian = null;
            
            if (result.next()) {
                pembelian = new Pembelian();
                pembelian.setIdPembelian(result.getInt("idPembelian"));
                pembelian.setIdSupplier(result.getInt("idSupplier"));
                pembelian.setTglPembelian(result.getString("tglPembelian"));
                pembelian.setTotalHargaBeli(result.getInt("totalHargaBeli"));
            }else{
                throw new PembelianException("Pembelian dengan id "+idPembelian+" tidak ditemukan");
            }
            
            connection.commit();
            
            return pembelian;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PembelianException(e.getMessage());
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
    public Pembelian getPembelianSupplier(Integer idSupplier) throws PembelianException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNama);
            statement.setInt(1, idSupplier);
            
            ResultSet result = statement.executeQuery();
            Pembelian pembelian = null;
            
            if (result.next()) {
                pembelian = new Pembelian();
                pembelian.setIdPembelian(result.getInt("idPembelian"));
                pembelian.setIdSupplier(result.getInt("idSupplier"));
                pembelian.setTglPembelian(result.getString("tglPembelian"));
                pembelian.setTotalHargaBeli(result.getInt("totalHargaBeli"));
            }else{
                throw new PembelianException("Pembelian dengan idSupplier "+idSupplier+" tidak ditemukan");
            }
            
            connection.commit();
            
            return pembelian;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PembelianException(e.getMessage());
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
    public List<Pembelian> selectAllPembelian() throws PembelianException {
        Statement statement = null;
        List<Pembelian> list = new ArrayList<Pembelian>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Pembelian pembelian = null;
            
            while (result.next()) {
                pembelian = new Pembelian();
                pembelian.setIdPembelian(result.getInt("idPembelian"));
                pembelian.setIdSupplier(result.getInt("idSupplier"));
                pembelian.setTglPembelian(result.getString("tglPembelian"));
                pembelian.setTotalHargaBeli(result.getInt("totalHargaBeli"));
                list.add(pembelian);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PembelianException(e.getMessage());
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
