/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.DetailPenjualan;
import edu.timnas.sistembengkelmotor.entity.Penjualan;
import edu.timnas.sistembengkelmotor.error.DetailPenjualanException;
import edu.timnas.sistembengkelmotor.error.DetailPenjualanException;
import edu.timnas.sistembengkelmotor.error.PenjualanException;
import edu.timnas.sistembengkelmotor.service.DetailPenjualanDao;
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
public class DetailPenjualanDaoImpl implements DetailPenjualanDao{

    private Connection connection;
    
    public DetailPenjualanDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertDetailPenjualan = "INSERT INTO detailPenjualan "
            + "(idPenjualan, idOnderdil, jumlah, subTotal) "
            + "VALUES (?,?,?,?)";
    private final String updateDetailPenjualan = "UPDATE detailPenjualan "
            + "SET idPenjualan=?, idOnderdil=?, jumlah=?, subTotal=? "
            + "WHERE idDetailPenjualan=?";
    private final String deleteDetailPenjualan = "DELETE FROM detailPenjualan WHERE idDetailPenjualan=?";
    private final String getByIdDetailPenjualan = "SELECT * FROM detailPenjualan WHERE idDetailPenjualan=?";
    private final String getByIdPenjualan = "SELECT * FROM detailPenjualan WHERE idPenjualan=?";
    private final String selectAll = "SELECT * FROM detailPenjualan";

    @Override
    public void insertDetailPenjualan(DetailPenjualan detailPenjualan) throws DetailPenjualanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertDetailPenjualan);
            statement.setInt(1, detailPenjualan.getIdPenjualan());
            statement.setInt(2, detailPenjualan.getIdOnderdil());
            statement.setInt(3, detailPenjualan.getJumlah());
            statement.setInt(4, detailPenjualan.getSubTotal());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPenjualanException(e.getMessage());
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
    public void updateDetailPenjualan(DetailPenjualan detailPenjualan) throws DetailPenjualanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateDetailPenjualan);
            statement.setInt(1, detailPenjualan.getIdPenjualan());
            statement.setInt(2, detailPenjualan.getIdOnderdil());
            statement.setInt(3, detailPenjualan.getJumlah());
            statement.setInt(4, detailPenjualan.getSubTotal());
            statement.setInt(5, detailPenjualan.getIdDetailPenjualan());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPenjualanException(e.getMessage());
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
    public void deleteDetailPenjualan(Integer idDetailPenjualan) throws DetailPenjualanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteDetailPenjualan);
            statement.setInt(1, idDetailPenjualan);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPenjualanException(e.getMessage());
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
    public DetailPenjualan getDetailPenjualan(Integer idDetailPenjualan) throws DetailPenjualanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByIdDetailPenjualan);
            statement.setInt(1, idDetailPenjualan);
            
            ResultSet result = statement.executeQuery();
            DetailPenjualan detailPenjualan = null;
            
            if (result.next()) {
                detailPenjualan = new DetailPenjualan();
                detailPenjualan.setIdDetailPenjualan(result.getInt("idDetailPenjualan"));
                detailPenjualan.setIdPenjualan(result.getInt("idPenjualan"));
                detailPenjualan.setIdOnderdil(result.getInt("idOnderdil"));
                detailPenjualan.setJumlah(result.getInt("jumlah"));
                detailPenjualan.setSubTotal(result.getInt("subTotal"));
            }else{
                throw new DetailPenjualanException("DetailPenjualan dengan id "+idDetailPenjualan+" tidak ditemukan");
            }
            
            connection.commit();
            
            return detailPenjualan;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPenjualanException(e.getMessage());
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
    public DetailPenjualan getPenjualan(Integer idPenjualan) throws DetailPenjualanException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByIdPenjualan);
            statement.setInt(1, idPenjualan);
            
            ResultSet result = statement.executeQuery();
            DetailPenjualan detailPenjualan = null;
            
            if (result.next()) {
                detailPenjualan = new DetailPenjualan();
                detailPenjualan.setIdDetailPenjualan(result.getInt("idDetailPenjualan"));
                detailPenjualan.setIdPenjualan(result.getInt("idPenjualan"));
                detailPenjualan.setIdOnderdil(result.getInt("idOnderdil"));
                detailPenjualan.setJumlah(result.getInt("jumlah"));
                detailPenjualan.setSubTotal(result.getInt("subTotal"));
            }else{
                throw new DetailPenjualanException("DetailPenjualan dengan idPenjualan "+idPenjualan+" tidak ditemukan");
            }
            
            connection.commit();
            
            return detailPenjualan;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPenjualanException(e.getMessage());
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
    public List<DetailPenjualan> selectAllDetailPenjualan() throws DetailPenjualanException {
        Statement statement = null;
        List<DetailPenjualan> list = new ArrayList<DetailPenjualan>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            DetailPenjualan detailPenjualan = null;
            
            while (result.next()) {
                detailPenjualan = new DetailPenjualan();
                detailPenjualan.setIdDetailPenjualan(result.getInt("idDetailPenjualan"));
                detailPenjualan.setIdPenjualan(result.getInt("idPenjualan"));
                detailPenjualan.setIdOnderdil(result.getInt("idOnderdil"));
                detailPenjualan.setJumlah(result.getInt("jumlah"));
                detailPenjualan.setSubTotal(result.getInt("subTotal"));
                list.add(detailPenjualan);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPenjualanException(e.getMessage());
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
