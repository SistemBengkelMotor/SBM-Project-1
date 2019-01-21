/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.service;

import edu.timnas.sistembengkelmotor.entity.Supplier;
import edu.timnas.sistembengkelmotor.error.SupplierException;
import java.util.List;

/**
 *
 * @author teguhsis
 */
public interface SupplierDao {
    public void insertSupplier(Supplier supplier) throws SupplierException;
    public void updateSupplier(Supplier supplier) throws SupplierException;
    public void deleteSupplier(Integer idSupplier) throws SupplierException;
    public Supplier getSupplier(Integer idSupplier) throws SupplierException;
    public Supplier getSupplier(String namaSupplier) throws SupplierException;
    public List<Supplier> selectAllSupplier() throws SupplierException;
}
