/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Merk;
import edu.timnas.sistembengkelmotor.error.MerkException;
import edu.timnas.sistembengkelmotor.service.MerkDao;
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
public class MerkDaoImpl  implements MerkDao{
    
    private Connection connection;

    public MerkDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    private final String insertMerk = "INSERT INTO merk (namaMerk) "
            + "VALUES (?)";
    private final String updateMerk = "UPDATE merk SET namaMerk=? "
            + "WHERE idMerk=?";
    private final String deleteMerk = "DELETE FROM merk WHERE idMerk=?";
    private final String getById = "SELECT * FROM merk WHERE idMerk=?";
    private final String getByNama = "SELECT * FROM merk WHERE namaMerk=?";
    private final String selectAll = "SELECT * FROM merk";
    
    @Override
    public void insertMerk(Merk merk) throws MerkException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertMerk);
            statement.setString(1, merk.getNamaMerk());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MerkException(e.getMessage());
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
    public void updateMerk(Merk merk) throws MerkException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(updateMerk);
            statement.setString(1, merk.getNamaMerk());
            statement.setInt(2, merk.getIdMerk());
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MerkException(e.getMessage());
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
    public void deleteMerk(Integer idMerk) throws MerkException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(deleteMerk);
            statement.setInt(1, idMerk);
            statement.executeUpdate();
            
            connection.commit();
            
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MerkException(e.getMessage());
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
    public Merk getMerk(Integer idMerk) throws MerkException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getById);
            statement.setInt(1, idMerk);
            
            ResultSet result = statement.executeQuery();
            Merk merk = null;
            
            if (result.next()) {
                merk = new Merk();
                merk.setIdMerk(result.getInt("idMerk"));
                merk.setNamaMerk(result.getString("namaMerk"));
            }else{
                throw new MerkException("Merk dengan id "+idMerk+" tidak ditemukan");
            }
            
            connection.commit();
            
            return merk;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MerkException(e.getMessage());
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
    public Merk getMerk(String namaMerk) throws MerkException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(getByNama);
            statement.setString(1, namaMerk);
            
            ResultSet result = statement.executeQuery();
            Merk merk = null;
            
            if (result.next()) {
                merk = new Merk();
                merk.setIdMerk(result.getInt("idMerk"));
                merk.setNamaMerk(result.getString("namaMerk"));
            }else{
                throw new MerkException("Merk dengan namaMerk "+namaMerk+" tidak ditemukan");
            }
            
            connection.commit();
            
            return merk;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MerkException(e.getMessage());
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
    public List<Merk> selectAllMerk() throws MerkException {
        Statement statement = null;
        List<Merk> list = new ArrayList<Merk>();
        
        try {
            connection.setAutoCommit(false);
            
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery(selectAll);
            Merk merk = null;
            
            while (result.next()) {
                merk = new Merk();
                merk.setIdMerk(result.getInt("idMerk"));
                merk.setNamaMerk(result.getString("namaMerk"));
                list.add(merk);
            }
            
            connection.commit();
            
            return list;
        } catch (SQLException e) {
            
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            
            throw new MerkException(e.getMessage());
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
