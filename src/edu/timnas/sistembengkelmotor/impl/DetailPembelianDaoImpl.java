/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.DetailPembelian;
import edu.timnas.sistembengkelmotor.error.DetailPembelianException;
import edu.timnas.sistembengkelmotor.service.DetailPembelianDao;
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
public class DetailPembelianDaoImpl implements DetailPembelianDao{

    private Connection connection;
    
    public DetailPembelianDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertDetailPembelian = "INSERT INTO detailPembelian "
            + "(idPembelian, idOnderdil, jumlah, hargaBeliPerUnit, subTotalHargaBeli) "
            + "VALUES (?,?,?,?,?)";
    private final String updateDetailPembelian = "UPDATE detailPembelian "
            + "SET idPembelian=?, idOnderdil=?, jumlah=?, hargaBeliPerUnit=?, subTotalHargaBeli=? "
            + "WHERE idDetailPembelian=?";
    private final String deleteDetailPembelian = "DELETE FROM detailPembelian WHERE idDetailPembelian=?";
    private final String getByIdDetailPembelian = "SELECT * FROM detailPembelian WHERE idDetailPembelian=?";
    private final String getByIdPembelian = "SELECT * FROM detailPembelian WHERE idPembelian=?";
    private final String selectAll = "SELECT * FROM detailPembelian";

    @Override
    public void insertDetailPembelian(DetailPembelian detailPembelian) throws DetailPembelianException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertDetailPembelian);
            statement.setInt(1, detailPembelian.getIdPembelian());
            statement.setInt(2, detailPembelian.getIdOnderdil());
            statement.setInt(3, detailPembelian.getJumlah());
            statement.setInt(4, detailPembelian.getHargaBeliPerUnit());
            statement.setInt(5, detailPembelian.getSubTotalHargaBeli());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPembelianException(e.getMessage());
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
    public void updateDetailPembelian(DetailPembelian detailPembelian) throws DetailPembelianException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateDetailPembelian);
            statement.setInt(1, detailPembelian.getIdPembelian());
            statement.setInt(2, detailPembelian.getIdOnderdil());
            statement.setInt(3, detailPembelian.getJumlah());
            statement.setInt(4, detailPembelian.getHargaBeliPerUnit());
            statement.setInt(5, detailPembelian.getSubTotalHargaBeli());
            statement.setInt(6, detailPembelian.getIdDetailPembelian());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPembelianException(e.getMessage());
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
    public void deleteDetailPembelian(Integer idDetailPembelian) throws DetailPembelianException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteDetailPembelian);
            statement.setInt(1, idDetailPembelian);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPembelianException(e.getMessage());
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
    public DetailPembelian getDetailPembelian(Integer idDetailPembelian) throws DetailPembelianException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByIdDetailPembelian);
            statement.setInt(1, idDetailPembelian);
            
            ResultSet result = statement.executeQuery();
            DetailPembelian detailPembelian = null;
            
            if (result.next()) {
                detailPembelian = new DetailPembelian();
                detailPembelian.setIdDetailPembelian(result.getInt("idDetailPembelian"));
                detailPembelian.setIdPembelian(result.getInt("idPembelian"));
                detailPembelian.setIdOnderdil(result.getInt("idOnderdil"));
                detailPembelian.setJumlah(result.getInt("jumlah"));
                detailPembelian.setHargaBeliPerUnit(result.getInt("hargaBeliPerUnit"));
                detailPembelian.setSubTotalHargaBeli(result.getInt("subTotalHargaBeli"));
            }else{
                throw new DetailPembelianException("DetailPembelian dengan id "+idDetailPembelian+" tidak ditemukan");
            }
            
            connection.commit();
            
            return detailPembelian;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPembelianException(e.getMessage());
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
    public DetailPembelian getDetailPembelianSupplier(Integer idPembelian) throws DetailPembelianException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByIdPembelian);
            statement.setInt(1, idPembelian);
            
            ResultSet result = statement.executeQuery();
            DetailPembelian detailPembelian = null;
            
            if (result.next()) {
                detailPembelian = new DetailPembelian();
                detailPembelian.setIdDetailPembelian(result.getInt("idDetailPembelian"));
                detailPembelian.setIdPembelian(result.getInt("idPembelian"));
                detailPembelian.setIdOnderdil(result.getInt("idOnderdil"));
                detailPembelian.setJumlah(result.getInt("jumlah"));
                detailPembelian.setHargaBeliPerUnit(result.getInt("hargaBeliPerUnit"));
                detailPembelian.setSubTotalHargaBeli(result.getInt("subTotalHargaBeli"));
            }else{
                throw new DetailPembelianException("DetailPembelian dengan idPembelian "+idPembelian+" tidak ditemukan");
            }
            
            connection.commit();
            
            return detailPembelian;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPembelianException(e.getMessage());
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
    public List<DetailPembelian> selectAllDetailPembelian() throws DetailPembelianException {
        Statement statement = null;
        List<DetailPembelian> list = new ArrayList<DetailPembelian>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            DetailPembelian detailPembelian = null;
            
            while (result.next()) {
                detailPembelian = new DetailPembelian();
                detailPembelian.setIdDetailPembelian(result.getInt("idDetailPembelian"));
                detailPembelian.setIdPembelian(result.getInt("idPembelian"));
                detailPembelian.setIdOnderdil(result.getInt("idOnderdil"));
                detailPembelian.setJumlah(result.getInt("jumlah"));
                detailPembelian.setHargaBeliPerUnit(result.getInt("hargaBeliPerUnit"));
                detailPembelian.setSubTotalHargaBeli(result.getInt("subTotalHargaBeli"));
                list.add(detailPembelian);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailPembelianException(e.getMessage());
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
