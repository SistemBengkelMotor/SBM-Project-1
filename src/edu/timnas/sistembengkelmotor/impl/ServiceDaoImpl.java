/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Service;
import edu.timnas.sistembengkelmotor.error.ServiceException;
import edu.timnas.sistembengkelmotor.service.ServiceDao;
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
public class ServiceDaoImpl implements ServiceDao{
    
    private Connection connection;
    
    public ServiceDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertService = "INSERT INTO service "
            + "(idMekanik, nopol, idPelanggan, idKasir, tglService, tglSelesai, totalHarga, bayar, kembalian) "
            + "VALUES (?,?,?,?,?,?,?,?,?)";
    private final String updateService = "UPDATE service "
            + "SET idMekanik=?, nopol=?, idPelanggan=?, idKasir=?, tglService=?, tglSelesai=?, totalHarga=?, "
            + "bayar=?, kembalian=? "
            + "WHERE idService=?";
    private final String deleteService = "DELETE FROM service WHERE idService=?";
    private final String getById = "SELECT * FROM service WHERE idService=?";
    private final String getByNopol = "SELECT * FROM service WHERE namaService=?";
    private final String selectAll = "SELECT * FROM service";

    @Override
    public void insertService(Service service) throws ServiceException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertService);
            statement.setInt(1, service.getIdMekanik());
            statement.setString(2, service.getNopol());
            statement.setInt(3, service.getIdPelanggan());
            statement.setInt(4, service.getIdKasir());
            statement.setString(5, service.getTglService());
            statement.setString(6, service.getTglSelesai());
            statement.setInt(7, service.getTotalHarga());
            statement.setInt(8, service.getBayar());
            statement.setInt(9, service.getKembalian());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new ServiceException(e.getMessage());
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
    public void updateService(Service service) throws ServiceException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateService);
            statement.setInt(1, service.getIdMekanik());
            statement.setString(2, service.getNopol());
            statement.setInt(3, service.getIdPelanggan());
            statement.setInt(4, service.getIdKasir());
            statement.setString(5, service.getTglService());
            statement.setString(6, service.getTglSelesai());
            statement.setInt(7, service.getTotalHarga());
            statement.setInt(8, service.getBayar());
            statement.setInt(9, service.getKembalian());
            statement.setInt(10, service.getIdService());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new ServiceException(e.getMessage());
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
    public void deleteService(Integer idService) throws ServiceException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteService);
            statement.setInt(1, idService);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new ServiceException(e.getMessage());
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
    public Service getService(Integer idService) throws ServiceException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idService);
            
            ResultSet result = statement.executeQuery();
            Service service = null;
            
            if (result.next()) {
                service = new Service();
                service.setIdService(result.getInt("idService"));
                service.setIdMekanik(result.getInt("idMekanik"));
                service.setNopol(result.getString("nopol"));
                service.setIdPelanggan(result.getInt("idPelanggan"));
                service.setIdKasir(result.getInt("idKasir"));
                service.setTglService(result.getString("tglService"));
                service.setTglSelesai(result.getString("tglSelesai"));
                service.setTotalHarga(result.getInt("totalHarga"));
                service.setBayar(result.getInt("bayar"));
                service.setKembalian(result.getInt("kembalian"));
            }else{
                throw new ServiceException("Service dengan id "+idService+" tidak ditemukan");
            }
            
            connection.commit();
            
            return service;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new ServiceException(e.getMessage());
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
    public Service getServiceNopol(Integer nopol) throws ServiceException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNopol);
            statement.setInt(1, nopol);
            
            ResultSet result = statement.executeQuery();
            Service service = null;
            
            if (result.next()) {
                service = new Service();
                service.setIdService(result.getInt("idService"));
                service.setIdMekanik(result.getInt("idMekanik"));
                service.setNopol(result.getString("nopol"));
                service.setIdPelanggan(result.getInt("idPelanggan"));
                service.setIdKasir(result.getInt("idKasir"));
                service.setTglService(result.getString("tglService"));
                service.setTglSelesai(result.getString("tglSelesai"));
                service.setTotalHarga(result.getInt("totalHarga"));
                service.setBayar(result.getInt("bayar"));
                service.setKembalian(result.getInt("kembalian"));
            }else{
                throw new ServiceException("Service dengan Nomor Polisi "+nopol+" tidak ditemukan");
            }
            
            connection.commit();
            
            return service;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new ServiceException(e.getMessage());
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
    public List<Service> selectAllService() throws ServiceException {
        Statement statement = null;
        List<Service> list = new ArrayList<Service>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Service service = null;
            
            while (result.next()) {
                service = new Service();
                service.setIdService(result.getInt("idService"));
                service.setIdMekanik(result.getInt("idMekanik"));
                service.setNopol(result.getString("nopol"));
                service.setIdPelanggan(result.getInt("idPelanggan"));
                service.setIdKasir(result.getInt("idKasir"));
                service.setTglService(result.getString("tglService"));
                service.setTglSelesai(result.getString("tglSelesai"));
                service.setTotalHarga(result.getInt("totalHarga"));
                service.setBayar(result.getInt("bayar"));
                service.setKembalian(result.getInt("kembalian"));
                list.add(service);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new ServiceException(e.getMessage());
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
