/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Pelanggan;
import edu.timnas.sistembengkelmotor.error.PelangganException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface PelangganDao {
    public void insertPelanggan(Pelanggan pelanggan) throws PelangganException;
    public void updatePelanggan(Pelanggan pelanggan) throws PelangganException;
    public void deletePelanggan(Integer idPelanggan) throws PelangganException;
    public Pelanggan getPelanggan(Integer idPelanggan) throws PelangganException;
    public Pelanggan getPelanggan(String namaPelanggan) throws PelangganException;
    public List<Pelanggan> selectAllPelanggan() throws PelangganException;
}
