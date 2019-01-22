/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.DetailPenjualan;
import edu.timnas.sistembengkelmotor.error.DetailPembelianException;
import edu.timnas.sistembengkelmotor.error.DetailPenjualanException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface DetailPenjualanDao {
    public void insertDetailPenjualan(DetailPenjualan detailPenjualan) throws DetailPenjualanException;
    public void updateDetailPenjualan(DetailPenjualan detailPenjualan) throws DetailPenjualanException;
    public void deleteDetailPenjualan(Integer idDetailPenjualan) throws DetailPenjualanException;
    public DetailPenjualan getDetailPenjualan(Integer idDetailPenjualan) throws DetailPenjualanException;
    public DetailPenjualan getPenjualan(Integer idPenjualan) throws DetailPenjualanException;
    public List<DetailPenjualan> selectAllDetailPenjualan() throws DetailPenjualanException;
}
