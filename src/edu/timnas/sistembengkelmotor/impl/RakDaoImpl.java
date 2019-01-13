/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.impl;

import edu.timnas.sistembengkelmotor.entity.Rak;
import edu.timnas.sistembengkelmotor.error.RakException;
import edu.timnas.sistembengkelmotor.service.RakDao;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public class RakDaoImpl implements RakDao{
    
    private Connection connection;

    public RakDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void insertRak(Rak rak) throws RakException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateRak(Rak rak) throws RakException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteRak(Integer idRak) throws RakException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rak getRak(Integer idRak) throws RakException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Rak getRak(String lokasi) throws RakException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Rak> selectAllRak() throws RakException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
