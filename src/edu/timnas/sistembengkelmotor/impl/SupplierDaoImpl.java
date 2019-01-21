/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Supplier;
import edu.timnas.sistembengkelmotor.error.SupplierException;
import edu.timnas.sistembengkelmotor.service.SupplierDao;
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
public class SupplierDaoImpl implements SupplierDao{
    
    private Connection connection;
    
    public SupplierDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertSupplier = "INSERT INTO supplier "
            + "(namaSupplier, alamatSupplier, noTelp) "
            + "VALUES (?,?,?)";
    private final String updateSupplier = "UPDATE supplier "
            + "SET namaSupplier=?, alamatSupplier=?, noTelp=? "
            + "WHERE idSupplier=?";
    private final String deleteSupplier = "DELETE FROM supplier WHERE idSupplier=?";
    private final String getById = "SELECT * FROM supplier WHERE idSupplier=?";
    private final String getByNama = "SELECT * FROM supplier WHERE namaSupplier=?";
    private final String selectAll = "SELECT * FROM supplier";
    
    @Override
    public void insertSupplier(Supplier supplier) throws SupplierException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertSupplier);
            statement.setString(1, supplier.getNamaSupplier());
            statement.setString(2, supplier.getAlamatSupplier());
            statement.setString(3, supplier.getNoTelp());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new SupplierException(e.getMessage());
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
    public void updateSupplier(Supplier supplier) throws SupplierException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateSupplier);
            statement.setString(1, supplier.getNamaSupplier());
            statement.setString(2, supplier.getAlamatSupplier());
            statement.setString(3, supplier.getNoTelp());
            statement.setInt(4, supplier.getIdSupplier());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new SupplierException(e.getMessage());
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
    public void deleteSupplier(Integer idSupplier) throws SupplierException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteSupplier);
            statement.setInt(1, idSupplier);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new SupplierException(e.getMessage());
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
    public Supplier getSupplier(Integer idSupplier) throws SupplierException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idSupplier);
            
            ResultSet result = statement.executeQuery();
            Supplier supplier = null;
            
            if (result.next()) {
                supplier = new Supplier();
                supplier.setIdSupplier(result.getInt("idSupplier"));
                supplier.setNamaSupplier(result.getString("namaSupplier"));
                supplier.setAlamatSupplier(result.getString("alamatSupplier"));
                supplier.setNoTelp(result.getString("noTelp"));
            }else{
                throw new SupplierException("Supplier dengan id "+idSupplier+" tidak ditemukan");
            }
            
            connection.commit();
            
            return supplier;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new SupplierException(e.getMessage());
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
    public Supplier getSupplier(String namaSupplier) throws SupplierException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNama);
            statement.setString(1, namaSupplier);
            
            ResultSet result = statement.executeQuery();
            Supplier supplier = null;
            
            if (result.next()) {
                supplier = new Supplier();
                supplier.setIdSupplier(result.getInt("idSupplier"));
                supplier.setNamaSupplier(result.getString("namaSupplier"));
                supplier.setAlamatSupplier(result.getString("alamatSupplier"));
                supplier.setNoTelp(result.getString("noTelp"));
            }else{
                throw new SupplierException("Supplier dengan namaSupplier "+namaSupplier+" tidak ditemukan");
            }
            
            connection.commit();
            
            return supplier;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new SupplierException(e.getMessage());
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
    public List<Supplier> selectAllSupplier() throws SupplierException {
        Statement statement = null;
        List<Supplier> list = new ArrayList<Supplier>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Supplier supplier = null;
            
            while (result.next()) {
                supplier = new Supplier();
                supplier.setIdSupplier(result.getInt("idSupplier"));
                supplier.setNamaSupplier(result.getString("namaSupplier"));
                supplier.setAlamatSupplier(result.getString("alamatSupplier"));
                supplier.setNoTelp(result.getString("noTelp"));
                list.add(supplier);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new SupplierException(e.getMessage());
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
