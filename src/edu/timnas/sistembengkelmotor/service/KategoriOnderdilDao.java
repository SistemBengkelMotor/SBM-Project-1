/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.KategoriOnderdil;
import edu.timnas.sistembengkelmotor.error.KategoriOnderdilException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface KategoriOnderdilDao {
    
    public void insertKategoriOnderdil(KategoriOnderdil kategoriOnderdil ) throws KategoriOnderdilException;
    
    public void updateKategoriOnderdil(KategoriOnderdil kategoriOnderdil ) throws KategoriOnderdilException;
    
    public void deleteKategoriOnderdil(Integer idKaton) throws KategoriOnderdilException;
    
    public KategoriOnderdil getKategoriOnderdil(Integer idKaton ) throws KategoriOnderdilException;
    
    public KategoriOnderdil getKategoriOnderdil(String namaKaton ) throws KategoriOnderdilException;
    
    public List<KategoriOnderdil> selectAllKategoriOnderdil() throws KategoriOnderdilException;
    
    
    
    
}
