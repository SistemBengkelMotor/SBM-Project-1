/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.DetailPembelian;
import edu.timnas.sistembengkelmotor.error.DetailPembelianException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface DetailPembelianDao {
    public void insertDetailPembelian(DetailPembelian detailPembelian) throws DetailPembelianException;
    public void updateDetailPembelian(DetailPembelian detailPembelian) throws DetailPembelianException;
    public void deleteDetailPembelian(Integer idDetailPembelian) throws DetailPembelianException;
    public DetailPembelian getDetailPembelian(Integer idDetailPembelian) throws DetailPembelianException;
    public DetailPembelian getDetailPembelianSupplier(Integer idPembelian) throws DetailPembelianException;
    public List<DetailPembelian> selectAllDetailPembelian() throws DetailPembelianException;
}
