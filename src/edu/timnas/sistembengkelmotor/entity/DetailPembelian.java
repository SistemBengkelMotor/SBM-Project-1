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
public class DetailPembelian {
    
    private int idDetailPembelian;
    private int idPembelian;
    private int idOnderdil;
    private int jumlah;
    private int hargaBeliPerUnit;
    private int subTotalHargaBeli;
//  atribut kombinasi
    //  dari tabel Onderdil
    private int idKaton;
    private int namaOnderdil;
    //  dari tabel Pembelian dan Supplier
    private int idSupplier;
    private String namaSupplier;
    private String tglPembelian;
    
//  2 construcors
    public DetailPembelian(){
        
    }
    public DetailPembelian(int idPembelian, int idOnderdil, int jumlah,int hargaBeliPerUnit, int subTotalHargaBeli, int idKaton, int namaOnderdil, int idSupplier, String namaSupplier, String tglPembelian) {
        this.idPembelian = idPembelian;
        this.idOnderdil = idOnderdil;
        this.jumlah = jumlah;
        this.hargaBeliPerUnit = hargaBeliPerUnit;
        this.subTotalHargaBeli = subTotalHargaBeli;
        this.idKaton = idKaton;
        this.namaOnderdil = namaOnderdil;
        this.idSupplier = idSupplier;
        this.namaSupplier = namaSupplier;
        this.tglPembelian = tglPembelian;
    }
    
//    getter & setter
    public int getIdDetailPembelian() {
        return idDetailPembelian;
    }

    public void setIdDetailPembelian(int idDetailPembelian) {
        this.idDetailPembelian = idDetailPembelian;
    }

    public int getIdPembelian() {
        return idPembelian;
    }

    public void setIdPembelian(int idPembelian) {
        this.idPembelian = idPembelian;
    }

    public int getIdOnderdil() {
        return idOnderdil;
    }

    public void setIdOnderdil(int idOnderdil) {
        this.idOnderdil = idOnderdil;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int getSubTotalHargaBeli() {
        return subTotalHargaBeli;
    }

    public void setSubTotalHargaBeli(int subTotalHargaBeli) {
        this.subTotalHargaBeli = subTotalHargaBeli;
    }

    public int getIdKaton() {
        return idKaton;
    }

    public void setIdKaton(int idKaton) {
        this.idKaton = idKaton;
    }

    public int getNamaOnderdil() {
        return namaOnderdil;
    }

    public void setNamaOnderdil(int namaOnderdil) {
        this.namaOnderdil = namaOnderdil;
    }

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getTglPembelian() {
        return tglPembelian;
    }

    public void setTglPembelian(String tglPembelian) {
        this.tglPembelian = tglPembelian;
    }

    public int getHargaBeliPerUnit() {
        return hargaBeliPerUnit;
    }

    public void setHargaBeliPerUnit(int hargaBeliPerUnit) {
        this.hargaBeliPerUnit = hargaBeliPerUnit;
    }
    
//  equals & hashCode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idDetailPembelian;
        hash = 67 * hash + this.idPembelian;
        hash = 67 * hash + this.idOnderdil;
        hash = 67 * hash + this.jumlah;
        hash = 67 * hash + this.hargaBeliPerUnit;
        hash = 67 * hash + this.subTotalHargaBeli;
        hash = 67 * hash + this.idKaton;
        hash = 67 * hash + this.namaOnderdil;
        hash = 67 * hash + this.idSupplier;
        hash = 67 * hash + Objects.hashCode(this.namaSupplier);
        hash = 67 * hash + Objects.hashCode(this.tglPembelian);
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
        final DetailPembelian other = (DetailPembelian) obj;
        if (this.idDetailPembelian != other.idDetailPembelian) {
            return false;
        }
        if (this.idPembelian != other.idPembelian) {
            return false;
        }
        if (this.idOnderdil != other.idOnderdil) {
            return false;
        }
        if (this.jumlah != other.jumlah) {
            return false;
        }
        if (this.hargaBeliPerUnit != other.hargaBeliPerUnit) {
            return false;
        }
        if (this.subTotalHargaBeli != other.subTotalHargaBeli) {
            return false;
        }
        if (this.idKaton != other.idKaton) {
            return false;
        }
        if (this.namaOnderdil != other.namaOnderdil) {
            return false;
        }
        if (this.idSupplier != other.idSupplier) {
            return false;
        }
        if (!Objects.equals(this.namaSupplier, other.namaSupplier)) {
            return false;
        }
        if (!Objects.equals(this.tglPembelian, other.tglPembelian)) {
            return false;
        }
        return true;
    }    
}
