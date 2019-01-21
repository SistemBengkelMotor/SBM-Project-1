/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Onderdil;
import edu.timnas.sistembengkelmotor.error.OnderdilException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface OnderdilDao {
    public void insertOnderdil(Onderdil onderdil) throws OnderdilException;
    public void updateOnderdil(Onderdil onderdil) throws OnderdilException;
    public void deleteOnderdil(Integer idOnderdil) throws OnderdilException;
    public Onderdil getOnderdil(Integer idOnderdil) throws OnderdilException;
    public Onderdil getOnderdil(String namaOnderdil) throws OnderdilException;
    public List<Onderdil> selectAllOnderdil() throws OnderdilException;
    public List<Onderdil> selectAllCombOnderdil() throws OnderdilException;
}
