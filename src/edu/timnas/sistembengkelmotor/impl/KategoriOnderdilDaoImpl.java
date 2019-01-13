/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.KategoriOnderdil;
import edu.timnas.sistembengkelmotor.error.KategoriOnderdilException;
import edu.timnas.sistembengkelmotor.service.KategoriOnderdilDao;
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
public class KategoriOnderdilDaoImpl implements KategoriOnderdilDao{

    private Connection connection;

    public KategoriOnderdilDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertKategoriOnderdil = "INSERT INTO KateoriOnderdil (namaKaton) "
            + "VALUES (?)";
    private final String updateKategoriOnderdil = "UPDATE KategoriOnderdil SET namaKaton=? "
            + "WHERE idKaton=?";
    private final String deleteKategoriOnderdil = "DELETE FROM KategoriOnderdil WHERE idKaton=?";
    private final String getById = "SELECT * FROM KategoriOnderdil WHERE idKaton=?";
    private final String getByNama = "SELECT * FROM KategoriOnderdil WHERE namaKaton=?";
    private final String selectAll = "SELECT * FROM KategoriOnderdil";
    
    @Override
    public void insertKategoriOnderdil(KategoriOnderdil kategoriOnderdil) throws KategoriOnderdilException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insertKategoriOnderdil);
            statement.setString(1, kategoriOnderdil.getNamaKaton());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new KategoriOnderdilException(e.getMessage());
        }finally{
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
    public void updateKategoriOnderdil(KategoriOnderdil kategoriOnderdil) throws KategoriOnderdilException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(updateKategoriOnderdil);
            statement.setString(1, kategoriOnderdil.getNamaKaton());
            statement.setInt(2, kategoriOnderdil.getIdKaton());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new KategoriOnderdilException(e.getMessage());
        }finally{
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
    public void deleteKategoriOnderdil(Integer idKaton) throws KategoriOnderdilException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(deleteKategoriOnderdil);
            statement.setInt(1, idKaton);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new KategoriOnderdilException(e.getMessage());
        }finally{
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
    public KategoriOnderdil getKategoriOnderdil(Integer idKaton) throws KategoriOnderdilException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idKaton);
            
            ResultSet result = statement.executeQuery();
            KategoriOnderdil kategoriOnderdil = null;
            
            if (result.next()) {
                kategoriOnderdil = new KategoriOnderdil();
                kategoriOnderdil.setIdKaton(result.getInt("idKaton"));
                kategoriOnderdil.setNamaKaton(result.getString("namaKaton"));
            }else{
                throw new KategoriOnderdilException("Kategori Onderdil dengan id "+idKaton+" tidak ditemukan");
            }
            return kategoriOnderdil;
        } catch (SQLException e) {
            throw new KategoriOnderdilException(e.getMessage());
        }finally{
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
    public KategoriOnderdil getKategoriOnderdil(String namaKaton) throws KategoriOnderdilException {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(getByNama);
            statement.setString(1, namaKaton);
            
            ResultSet result = statement.executeQuery();
            KategoriOnderdil kategoriOnderdil = null;
            
            if (result.next()) {
                kategoriOnderdil = new KategoriOnderdil();
                kategoriOnderdil.setIdKaton(result.getInt("idKaton"));
                kategoriOnderdil.setNamaKaton(result.getString("namaKaton"));
            }else{
                throw new KategoriOnderdilException("Kategori Onderdil dengan nama "+namaKaton+" tidak ditemukan");
            }
            return kategoriOnderdil;
        } catch (SQLException e) {
            throw new KategoriOnderdilException(e.getMessage());
        }finally{
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
    public List<KategoriOnderdil> selectAllKategoriOnderdil() throws KategoriOnderdilException {
        Statement statement = null;
        List<KategoriOnderdil> list = new ArrayList<KategoriOnderdil>();
        
        try {
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            KategoriOnderdil kategoriOnderdil = null;
            
            while (result.next()) {
                kategoriOnderdil = new KategoriOnderdil();
                kategoriOnderdil.setIdKaton(result.getInt("idKaton"));
                kategoriOnderdil.setNamaKaton(result.getString("namaKaton"));
                list.add(kategoriOnderdil);
            }
            return list;
        } catch (SQLException e) {
            throw new KategoriOnderdilException(e.getMessage());
        }finally{
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
