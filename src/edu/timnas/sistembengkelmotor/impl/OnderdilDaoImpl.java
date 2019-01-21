/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Onderdil;
import edu.timnas.sistembengkelmotor.error.OnderdilException;
import edu.timnas.sistembengkelmotor.service.OnderdilDao;
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
public class OnderdilDaoImpl implements OnderdilDao{

    private Connection connection;
    
    public OnderdilDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertOnderdil = "INSERT INTO onderdil "
            + "(idKaton,idRak,namaOnderdil,hargaJual,stok, satuan) "
            + "VALUES (?,?,?,?,?,?)";
    private final String updateOnderdil = "UPDATE onderdil SET "
            + "idKaton=?, idRak=?, namaOnderdil=?, hargaJual=?, stok=?, satuan=? "
            + "WHERE idOnderdil=?";
    private final String deleteOnderdil = "DELETE FROM onderdil WHERE idOnderdil=?";
    private final String getById = "SELECT * FROM onderdil WHERE idOnderdil=?";
    private final String getByNama = "SELECT * FROM onderdil WHERE namaOnderdil=?";
    private final String selectAll = "SELECT * FROM onderdil";
    private final String selectAllComb = "SELECT ond.idOnderdil, kat.namaKaton, "
            + "rak.lokasi, ond.namaOnderdil, ond.hargaJual, ond.stok, ond.satuan "
            + "FROM kategoriOnderdil as kat, rak as rak, onderdil as ond "
            + "WHERE ond.idKaton=kat.idKaton AND rak.idRak=ond.idRak;";
    
    @Override
    public void insertOnderdil(Onderdil onderdil) throws OnderdilException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertOnderdil);
            statement.setInt(1, onderdil.getIdKaton());
            statement.setInt(2, onderdil.getIdRak());
            statement.setString(3, onderdil.getNamaOnderdil());
            statement.setInt(4, onderdil.getHargaJual());
            statement.setInt(5, onderdil.getStok());
            statement.setString(6, onderdil.getSatuan());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new OnderdilException(e.getMessage());
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
    public void updateOnderdil(Onderdil onderdil) throws OnderdilException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateOnderdil);
            statement.setInt(1, onderdil.getIdKaton());
            statement.setInt(2, onderdil.getIdRak());
            statement.setString(3, onderdil.getNamaOnderdil());
            statement.setInt(4, onderdil.getHargaJual());
            statement.setInt(5, onderdil.getStok());
            statement.setString(6, onderdil.getSatuan());
            statement.setInt(7, onderdil.getIdOnderdil());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new OnderdilException(e.getMessage());
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
    public void deleteOnderdil(Integer idOnderdil) throws OnderdilException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteOnderdil);
            statement.setInt(1, idOnderdil);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new OnderdilException(e.getMessage());
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
    public Onderdil getOnderdil(Integer idOnderdil) throws OnderdilException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idOnderdil);
            
            ResultSet result = statement.executeQuery();
            Onderdil onderdil = null;
            
            if (result.next()) {
                onderdil = new Onderdil();
                onderdil.setIdOnderdil(result.getInt("idOnderdil"));
                onderdil.setIdKaton(result.getInt("idKaton"));
                onderdil.setIdRak(result.getInt("idRak"));
                onderdil.setNamaOnderdil(result.getString("namaOnderdil"));
                onderdil.setHargaJual(result.getInt("hargaJual"));
                onderdil.setStok(result.getInt("stok"));
                onderdil.setSatuan(result.getString("satuan"));
            }else{
                throw new OnderdilException("Onderdil dengan id "+idOnderdil+" tidak ditemukan");
            }
            
            connection.commit();
            
            return onderdil;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new OnderdilException(e.getMessage());
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
    public Onderdil getOnderdil(String namaOnderdil) throws OnderdilException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNama);
            statement.setString(1, namaOnderdil);
            
            ResultSet result = statement.executeQuery();
            Onderdil onderdil = null;
            
            if (result.next()) {
                onderdil = new Onderdil();
                onderdil.setIdOnderdil(result.getInt("idOnderdil"));
                onderdil.setIdKaton(result.getInt("idKaton"));
                onderdil.setIdRak(result.getInt("idRak"));
                onderdil.setNamaOnderdil(result.getString("namaOnderdil"));
                onderdil.setHargaJual(result.getInt("hargaJual"));
                onderdil.setStok(result.getInt("stok"));
                onderdil.setSatuan(result.getString("satuan"));
            }else{
                throw new OnderdilException("Onderdil dengan idMerk "+namaOnderdil+" tidak ditemukan");
            }
            
            connection.commit();
            
            return onderdil;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new OnderdilException(e.getMessage());
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
    public List<Onderdil> selectAllOnderdil() throws OnderdilException {
        Statement statement = null;
        List<Onderdil> list = new ArrayList<Onderdil>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Onderdil onderdil = null;
            
            while (result.next()) {
                onderdil = new Onderdil();
                onderdil.setIdOnderdil(result.getInt("idOnderdil"));
                onderdil.setIdKaton(result.getInt("idKaton"));
                onderdil.setIdRak(result.getInt("idRak"));
                onderdil.setNamaOnderdil(result.getString("namaOnderdil"));
                onderdil.setHargaJual(result.getInt("hargaJual"));
                onderdil.setStok(result.getInt("stok"));
                onderdil.setSatuan(result.getString("satuan"));
                list.add(onderdil);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new OnderdilException(e.getMessage());
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
    public List<Onderdil> selectAllCombOnderdil() throws OnderdilException {
        Statement statement = null;
        List<Onderdil> list = new ArrayList<Onderdil>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAllComb);
            Onderdil onderdil = null;
            
            while (result.next()) {
                onderdil = new Onderdil();
                onderdil.setIdOnderdil(result.getInt("idOnderdil"));
                onderdil.setNamaKaton(result.getString("namaKaton"));
                onderdil.setLokasi(result.getString("lokasi"));
                onderdil.setNamaOnderdil(result.getString("namaOnderdil"));
                onderdil.setHargaJual(result.getInt("hargaJual"));
                onderdil.setStok(result.getInt("stok"));
                onderdil.setSatuan(result.getString("satuan"));
                list.add(onderdil);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new OnderdilException(e.getMessage());
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
