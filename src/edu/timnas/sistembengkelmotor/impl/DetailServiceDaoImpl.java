/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.DetailService;
import edu.timnas.sistembengkelmotor.error.DetailServiceException;
import edu.timnas.sistembengkelmotor.service.DetailServiceDao;
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
public class DetailServiceDaoImpl implements DetailServiceDao{
    
    private Connection connection;
    
    public DetailServiceDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertDetailService = "INSERT INTO detailService "
            + "(idService, idJasa, idOnderdil, jumlah, subTotalHarga) "
            + "VALUES (?,?,?,?,?)";
    private final String updateDetailService = "UPDATE detailService "
            + "SET idService=?, idJasa=?, idOnderdil=?, jumlah=?, subTotalHarga=? "
            + "WHERE idDetailService=?";
    private final String deleteDetailService = "DELETE FROM detailService WHERE idDetailService=?";
    private final String getByIdDetailService = "SELECT * FROM detailService WHERE idDetailService=?";
    private final String getByIdService = "SELECT * FROM detailService WHERE idService=?";
    private final String selectAll = "SELECT * FROM detailService";
    
    @Override
    public void insertDetailService(DetailService detailService) throws DetailServiceException {
         PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertDetailService);
            statement.setInt(1, detailService.getIdService());
            statement.setInt(2, detailService.getIdJasa());
            statement.setInt(3, detailService.getIdOnderdil());
            statement.setInt(4, detailService.getJumlah());
            statement.setInt(5, detailService.getSubTotalHarga());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailServiceException(e.getMessage());
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
    public void updateDetailService(DetailService detailService) throws DetailServiceException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateDetailService);
            statement.setInt(1, detailService.getIdService());
            statement.setInt(2, detailService.getIdJasa());
            statement.setInt(3, detailService.getIdOnderdil());
            statement.setInt(4, detailService.getJumlah());
            statement.setInt(5, detailService.getSubTotalHarga());
            statement.setInt(6, detailService.getIdDetailService());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailServiceException(e.getMessage());
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
    public void deleteDetailService(Integer idDetailService) throws DetailServiceException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteDetailService);
            statement.setInt(1, idDetailService);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailServiceException(e.getMessage());
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
    public DetailService getDetailService(Integer idDetailService) throws DetailServiceException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByIdDetailService);
            statement.setInt(1, idDetailService);
            
            ResultSet result = statement.executeQuery();
            DetailService detailService = null;
            
            if (result.next()) {
                detailService = new DetailService();
                detailService.setIdDetailService(result.getInt("idDetailService"));
                detailService.setIdService(result.getInt("idService"));
                detailService.setIdJasa(result.getInt("idJasa"));
                detailService.setIdOnderdil(result.getInt("idOnderdil"));
                detailService.setJumlah(result.getInt("jumlah"));
                detailService.setSubTotalHarga(result.getInt("subTotalHarga"));
            }else{
                throw new DetailServiceException("DetailService dengan id "+idDetailService+" tidak ditemukan");
            }
            
            connection.commit();
            
            return detailService;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailServiceException(e.getMessage());
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
    public DetailService getService(Integer idService) throws DetailServiceException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByIdService);
            statement.setInt(1, idService);
            
            ResultSet result = statement.executeQuery();
            DetailService detailService = null;
            
            if (result.next()) {
                detailService = new DetailService();
                detailService.setIdDetailService(result.getInt("idDetailService"));
                detailService.setIdService(result.getInt("idService"));
                detailService.setIdJasa(result.getInt("idJasa"));
                detailService.setIdOnderdil(result.getInt("idOnderdil"));
                detailService.setJumlah(result.getInt("jumlah"));
                detailService.setSubTotalHarga(result.getInt("subTotalHarga"));
            }else{
                throw new DetailServiceException("DetailService dengan idService "+idService+" tidak ditemukan");
            }
            
            connection.commit();
            
            return detailService;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailServiceException(e.getMessage());
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
    public List<DetailService> selectAllDetailService() throws DetailServiceException {
        Statement statement = null;
        List<DetailService> list = new ArrayList<DetailService>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            DetailService detailService = null;
            
            while (result.next()) {
                detailService = new DetailService();
                detailService.setIdDetailService(result.getInt("idDetailService"));
                detailService.setIdService(result.getInt("idService"));
                detailService.setIdJasa(result.getInt("idJasa"));
                detailService.setIdOnderdil(result.getInt("idOnderdil"));
                detailService.setJumlah(result.getInt("jumlah"));
                detailService.setSubTotalHarga(result.getInt("subTotalHarga"));
                list.add(detailService);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new DetailServiceException(e.getMessage());
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
