/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.entity;

import java.util.Objects;

/**
 *
 * @author teguhsis
 */
public class Pembelian {
    
    private int idPembelian;
    private int idSupplier;
    private String tglPembelian;
    private int totalHargaBeli;
    
//    2 constructors
    public Pembelian(){
        
    }
    public Pembelian(int idSupplier, String tglPembelian, int totalHargaBeli) {
        this.idSupplier = idSupplier;
        this.tglPembelian = tglPembelian;
        this.totalHargaBeli = totalHargaBeli;
    }
    
//    getter & setter
    public int getIdPembelian() {
        return idPembelian;
    }

    public void setIdPembelian(int idPembelian) {
        this.idPembelian = idPembelian;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getTglPembelian() {
        return tglPembelian;
    }

    public void setTglPembelian(String tglPembelian) {
        this.tglPembelian = tglPembelian;
    }

    public int getTotalHargaBeli() {
        return totalHargaBeli;
    }

    public void setTotalHargaBeli(int totalHargaBeli) {
        this.totalHargaBeli = totalHargaBeli;
    }
    
//  equals & hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.idPembelian;
        hash = 67 * hash + this.idSupplier;
        hash = 67 * hash + Objects.hashCode(this.tglPembelian);
        hash = 67 * hash + this.totalHargaBeli;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pembelian other = (Pembelian) obj;
        if (this.idPembelian != other.idPembelian) {
            return false;
        }
        if (this.idSupplier != other.idSupplier) {
            return false;
        }
        if (this.totalHargaBeli != other.totalHargaBeli) {
            return false;
        }
        if (!Objects.equals(this.tglPembelian, other.tglPembelian)) {
            return false;
        }
        return true;
    }    
}
