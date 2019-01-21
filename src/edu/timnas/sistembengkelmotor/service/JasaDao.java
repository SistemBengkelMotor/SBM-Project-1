/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Jasa;
import edu.timnas.sistembengkelmotor.error.JasaException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface JasaDao {
    public void insertJasa(Jasa jasa) throws JasaException;
    public void updateJasa(Jasa jasa) throws JasaException;
    public void deleteJasa(Integer idJasa) throws JasaException;
    public Jasa getJasa(Integer idJasa) throws JasaException;
    public Jasa getJasa(String namaJasa) throws JasaException;
    public List<Jasa> selectAllJasa() throws JasaException;
}
