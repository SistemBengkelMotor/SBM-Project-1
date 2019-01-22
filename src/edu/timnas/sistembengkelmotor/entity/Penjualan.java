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
public class Penjualan {
    
    private int idPenjualan;
    private int idKasir;
    private String tglPenjualan;
    private int totalHarga;
    private int bayar;
    private int kembalian;
    //  untuk kombinasi
    private String namaKasir;
    
    
//    2 constructors
    public Penjualan(){
        
    }
    public Penjualan(int idKasir, String tglPenjualan, int totalHarga, int bayar, int kembalian, String namaKasir) {
        this.idKasir = idKasir;
        this.tglPenjualan = tglPenjualan;
        this.totalHarga = totalHarga;
        this.bayar = bayar;
        this.kembalian = kembalian;
        this.namaKasir = namaKasir;
    }
//    getter & setter

    public int getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(int idPenjualan) {
        this.idPenjualan = idPenjualan;
    }

    public int getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(int idKasir) {
        this.idKasir = idKasir;
    }

    public String getTglPenjualan() {
        return tglPenjualan;
    }

    public void setTglPenjualan(String tglPenjualan) {
        this.tglPenjualan = tglPenjualan;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }

    public int getBayar() {
        return bayar;
    }

    public void setBayar(int bayar) {
        this.bayar = bayar;
    }

    public int getKembalian() {
        return kembalian;
    }

    public void setKembalian(int kembalian) {
        this.kembalian = kembalian;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }


//  equals & hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.idPenjualan;
        hash = 53 * hash + this.idKasir;
        hash = 53 * hash + Objects.hashCode(this.tglPenjualan);
        hash = 53 * hash + this.totalHarga;
        hash = 53 * hash + this.bayar;
        hash = 53 * hash + this.kembalian;
        hash = 53 * hash + Objects.hashCode(this.namaKasir);
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
        final Penjualan other = (Penjualan) obj;
        if (this.idPenjualan != other.idPenjualan) {
            return false;
        }
        if (this.idKasir != other.idKasir) {
            return false;
        }
        if (this.totalHarga != other.totalHarga) {
            return false;
        }
        if (this.bayar != other.bayar) {
            return false;
        }
        if (this.kembalian != other.kembalian) {
            return false;
        }
        if (!Objects.equals(this.tglPenjualan, other.tglPenjualan)) {
            return false;
        }
        if (!Objects.equals(this.namaKasir, other.namaKasir)) {
            return false;
        }
        return true;
    }
    
    
}
