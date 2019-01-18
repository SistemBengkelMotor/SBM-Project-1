/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Mekanik;
import edu.timnas.sistembengkelmotor.error.MekanikException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface MekanikDao {
    
    public void insertMekanik(Mekanik mekanik) throws MekanikException;
    public void updateMekanik(Mekanik mekanik) throws MekanikException;
    public void deleteMekanik(Integer idMekanik) throws MekanikException;
    public Mekanik getMekanik(Integer idMekanik) throws MekanikException;
    public Mekanik getMekanik(String namaMekanik) throws MekanikException;
    public List<Mekanik> selectAllMekanik() throws MekanikException;
    
}
