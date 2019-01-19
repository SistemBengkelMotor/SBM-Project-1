/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Merk;
import edu.timnas.sistembengkelmotor.error.MerkException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface MerkDao {
    public void insertMerk(Merk merk) throws MerkException;
    public void updateMerk(Merk merk) throws MerkException;
    public void deleteMerk(Integer idMerk) throws MerkException;
    public Merk getMerk(Integer idMerk) throws MerkException;
    public Merk getMerk(String namaMerk) throws MerkException;
    public List<Merk> selectAllMerk() throws MerkException;
}
