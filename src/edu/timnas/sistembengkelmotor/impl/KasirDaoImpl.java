 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Kasir;
import edu.timnas.sistembengkelmotor.error.KasirException;
import edu.timnas.sistembengkelmotor.service.KasirDao;
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
public class KasirDaoImpl implements KasirDao{
    
    private Connection connection;
    
    public KasirDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertKasir = "INSERT INTO kasir "
            + "(namaKasir, alamatKasir, noTelp) "
            + "VALUES (?,?,?)";
    private final String updateKasir = "UPDATE kasir "
            + "SET namaKasir=?, alamatKasir=?, noTelp=? "
            + "WHERE idKasir=?";
    private final String deleteKasir = "DELETE FROM kasir WHERE idKasir=?";
    private final String getById = "SELECT * FROM kasir WHERE idKasir=?";
    private final String getByNama = "SELECT * FROM kasir WHERE namaKasir=?";
    private final String selectAll = "SELECT * FROM kasir";

    
    @Override
    public void insertKasir(Kasir kasir) throws KasirException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertKasir, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, kasir.getNamaKasir());
            statement.setString(2, kasir.getAlamatKasir());
            statement.setString(3, kasir.getNoTelp());
            statement.executeUpdate();
            
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                kasir.setIdKasir(result.getInt(1));
            }
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new KasirException(e.getMessage());
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
    public void updateKasir(Kasir kasir) throws KasirException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateKasir);
            statement.setString(1, kasir.getNamaKasir());
            statement.setString(2, kasir.getAlamatKasir());
            statement.setString(3, kasir.getNoTelp());
            statement.setInt(4, kasir.getIdKasir());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new KasirException(e.getMessage());
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
    public void deleteKasir(Integer idKasir) throws KasirException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteKasir);
            statement.setInt(1, idKasir);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new KasirException(e.getMessage());
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
    public Kasir getKasir(Integer idKasir) throws KasirException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idKasir);
            
            ResultSet result = statement.executeQuery();
            Kasir kasir = null;
            
            if (result.next()) {
                kasir = new Kasir();
                kasir.setIdKasir(result.getInt("idKasir"));
                kasir.setNamaKasir(result.getString("namaKasir"));
                kasir.setAlamatKasir(result.getString("alamatKasir"));
                kasir.setNoTelp(result.getString("noTelp"));
            }else{
                throw new KasirException("Kasir dengan id "+idKasir+" tidak ditemukan");
            }
            
            connection.commit();
            
            return kasir;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new KasirException(e.getMessage());
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
    public Kasir getKasir(String namaKasir) throws KasirException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNama);
            statement.setString(1, namaKasir);
            
            ResultSet result = statement.executeQuery();
            Kasir kasir = null;
            
            if (result.next()) {
                kasir = new Kasir();
                kasir.setIdKasir(result.getInt("idKasir"));
                kasir.setNamaKasir(result.getString("namaKasir"));
                kasir.setAlamatKasir(result.getString("alamatKasir"));
                kasir.setNoTelp(result.getString("noTelp"));
            }else{
                throw new KasirException("Kasir dengan namaKasir "+namaKasir+" tidak ditemukan");
            }
            
            connection.commit();
            
            return kasir;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new KasirException(e.getMessage());
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
    public List<Kasir> selectAllKasir() throws KasirException {
        Statement statement = null;
        List<Kasir> list = new ArrayList<Kasir>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Kasir kasir = null;
            
            while (result.next()) {
                kasir = new Kasir();
                kasir.setIdKasir(result.getInt("idKasir"));
                kasir.setNamaKasir(result.getString("namaKasir"));
                kasir.setAlamatKasir(result.getString("alamatKasir"));
                kasir.setNoTelp(result.getString("noTelp"));
                list.add(kasir);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new KasirException(e.getMessage());
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
