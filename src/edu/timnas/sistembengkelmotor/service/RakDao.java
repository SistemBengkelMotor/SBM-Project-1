/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Rak;
import edu.timnas.sistembengkelmotor.error.RakException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface RakDao {
    
    public void insertRak(Rak rak) throws RakException;
    public void updateRak(Rak rak) throws RakException;
    public void deleteRak(Integer idRak) throws RakException;
    public Rak getRak(Integer idRak) throws RakException;
    public Rak getRak(String lokasi) throws RakException;
    public List<Rak> selectAllRak() throws RakException;
    
}
