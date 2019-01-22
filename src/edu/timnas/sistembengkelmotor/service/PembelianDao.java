/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Pembelian;
import edu.timnas.sistembengkelmotor.error.PembelianException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface PembelianDao {
    public void insertPembelian(Pembelian pembelian) throws PembelianException;
    public void updatePembelian(Pembelian pembelian) throws PembelianException;
    public void deletePembelian(Integer idPembelian) throws PembelianException;
    public Pembelian getPembelian(Integer idPembelian) throws PembelianException;
    public Pembelian getPembelianSupplier(Integer idSupplier) throws PembelianException;
    public List<Pembelian> selectAllPembelian() throws PembelianException;
}
//CREATE TABLE pembelian(idPembelian int primary key auto_increment,
//idSupplier int, tglPembalian date, totalHargaBeli int(12) );