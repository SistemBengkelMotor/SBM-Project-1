/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Penjualan;
import edu.timnas.sistembengkelmotor.error.PenjualanException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface PenjualanDao {
    public void insertPenjualan(Penjualan penjualan) throws PenjualanException;
    public void updatePenjualan(Penjualan penjualan) throws PenjualanException;
    public void deletePenjualan(Integer idPenjualan) throws PenjualanException;
    public Penjualan getPenjualan(Integer idPenjualan) throws PenjualanException;
    public Penjualan getPenjualanKasir(Integer idKasir) throws PenjualanException;
    public List<Penjualan> selectAllPenjualan() throws PenjualanException;
}
