/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Kasir;
import edu.timnas.sistembengkelmotor.error.KasirException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface KasirDao {
    public void insertKasir(Kasir kasir) throws KasirException;
    public void updateKasir(Kasir kasir) throws KasirException;
    public void deleteKasir(Integer idKasir) throws KasirException;
    public Kasir getKasir(Integer idKasir) throws KasirException;
    public Kasir getKasir(String namaKasir) throws KasirException;
    public List<Kasir> selectAllKasir() throws KasirException;
}
