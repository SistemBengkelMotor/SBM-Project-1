/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Penjualan;
import edu.timnas.sistembengkelmotor.error.PenjualanException;
import edu.timnas.sistembengkelmotor.service.PenjualanDao;
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
public class PenjualanDaoImpl implements PenjualanDao{

    private Connection connection;
    
    public PenjualanDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertPenjualan = "INSERT INTO penjualan "
            + "(idKasir, tglPenjualan, totalHarga, bayar, kembalian) "
            + "VALUES (?,?,?,?,?)";
    private final String updatePenjualan = "UPDATE penjualan "
            + "SET idKasir=?, tglPenjualan=?, totalHarga=?, bayar=?, kembalian=? "
            + "WHERE idPenjualan=?";
    private final String deletePenjualan = "DELETE FROM penjualan WHERE idPenjualan=?";
    private final String getById = "SELECT * FROM penjualan WHERE idPenjualan=?";
    private final String getByKasir = "SELECT * FROM penjualan WHERE namaPenjualan=?";
    private final String selectAll = "SELECT * FROM penjualan";
    
    @Override
    public void insertPenjualan(Penjualan penjualan) throws PenjualanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertPenjualan);
            statement.setInt(1, penjualan.getIdKasir());
            statement.setString(2, penjualan.getTglPenjualan());
            statement.setInt(3, penjualan.getTotalHarga());
            statement.setInt(4, penjualan.getBayar());
            statement.setInt(5, penjualan.getKembalian());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PenjualanException(e.getMessage());
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
    public void updatePenjualan(Penjualan penjualan) throws PenjualanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updatePenjualan);
            statement.setInt(1, penjualan.getIdKasir());
            statement.setString(2, penjualan.getTglPenjualan());
            statement.setInt(3, penjualan.getTotalHarga());
            statement.setInt(4, penjualan.getBayar());
            statement.setInt(5, penjualan.getKembalian());
            statement.setInt(6, penjualan.getIdPenjualan());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PenjualanException(e.getMessage());
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
    public void deletePenjualan(Integer idPenjualan) throws PenjualanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deletePenjualan);
            statement.setInt(1, idPenjualan);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PenjualanException(e.getMessage());
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
    public Penjualan getPenjualan(Integer idPenjualan) throws PenjualanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idPenjualan);
            
            ResultSet result = statement.executeQuery();
            Penjualan penjualan = null;
            
            if (result.next()) {
                penjualan = new Penjualan();
                penjualan.setIdPenjualan(result.getInt("idPenjualan"));
                penjualan.setIdKasir(result.getInt("idKasir"));
                penjualan.setTglPenjualan(result.getString("tglPenjualan"));
                penjualan.setTotalHarga(result.getInt("totalHarga"));
                penjualan.setBayar(result.getInt("bayar"));
                penjualan.setKembalian(result.getInt("kembalian"));
            }else{
                throw new PenjualanException("Penjualan dengan id "+idPenjualan+" tidak ditemukan");
            }
            
            connection.commit();
            
            return penjualan;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PenjualanException(e.getMessage());
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
    public Penjualan getPenjualanKasir(Integer idKasir) throws PenjualanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByKasir);
            statement.setInt(1, idKasir);
            
            ResultSet result = statement.executeQuery();
            Penjualan penjualan = null;
            
            if (result.next()) {
                penjualan = new Penjualan();
                penjualan.setIdPenjualan(result.getInt("idPenjualan"));
                penjualan.setIdKasir(result.getInt("idKasir"));
                penjualan.setTglPenjualan(result.getString("tglPenjualan"));
                penjualan.setTotalHarga(result.getInt("totalHarga"));
                penjualan.setBayar(result.getInt("bayar"));
                penjualan.setKembalian(result.getInt("kembalian"));
            }else{
                throw new PenjualanException("Penjualan dengan idKasir "+idKasir+" tidak ditemukan");
            }
            
            connection.commit();
            
            return penjualan;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PenjualanException(e.getMessage());
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
    public List<Penjualan> selectAllPenjualan() throws PenjualanException {
        Statement statement = null;
        List<Penjualan> list = new ArrayList<Penjualan>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Penjualan penjualan = null;
            
            while (result.next()) {
                penjualan = new Penjualan();
               penjualan.setIdPenjualan(result.getInt("idPenjualan"));
                penjualan.setIdKasir(result.getInt("idKasir"));
                penjualan.setTglPenjualan(result.getString("tglPenjualan"));
                penjualan.setTotalHarga(result.getInt("totalHarga"));
                penjualan.setBayar(result.getInt("bayar"));
                penjualan.setKembalian(result.getInt("kembalian"));
                list.add(penjualan);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new PenjualanException(e.getMessage());
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
