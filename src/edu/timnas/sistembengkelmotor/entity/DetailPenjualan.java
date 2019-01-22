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
public class DetailPenjualan {
    
    private int idDetailPenjualan;
    private int idPenjualan;
    private int idOnderdil;
    private int jumlah;
    private int subTotal;
    //    untuk kombinasi
    private String namaOnderdil;
    private String hargaJual;
    private String stok;
    
//    2 constructors
    public DetailPenjualan(){
        
    }
    public DetailPenjualan(int idPenjualan, int idOnderdil, int jumlah, int subTotal, String namaOnderdil, String hargaJual, String stok) {
        this.idPenjualan = idPenjualan;
        this.idOnderdil = idOnderdil;
        this.jumlah = jumlah;
        this.subTotal = subTotal;
        this.namaOnderdil = namaOnderdil;
        this.hargaJual = hargaJual;
        this.stok = stok;
    }

//      getter & setter
    public int getIdDetailPenjualan() {
        return idDetailPenjualan;
    }

    public void setIdDetailPenjualan(int idDetailPenjualan) {
        this.idDetailPenjualan = idDetailPenjualan;
    }

    public int getIdPenjualan() {
        return idPenjualan;
    }

    public void setIdPenjualan(int idPenjualan) {
        this.idPenjualan = idPenjualan;
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

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public String getNamaOnderdil() {
        return namaOnderdil;
    }

    public void setNamaOnderdil(String namaOnderdil) {
        this.namaOnderdil = namaOnderdil;
    }

    public String getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(String hargaJual) {
        this.hargaJual = hargaJual;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
    
//      equals & hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idDetailPenjualan;
        hash = 59 * hash + this.idPenjualan;
        hash = 59 * hash + this.idOnderdil;
        hash = 59 * hash + this.jumlah;
        hash = 59 * hash + this.subTotal;
        hash = 59 * hash + Objects.hashCode(this.namaOnderdil);
        hash = 59 * hash + Objects.hashCode(this.hargaJual);
        hash = 59 * hash + Objects.hashCode(this.stok);
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
        final DetailPenjualan other = (DetailPenjualan) obj;
        if (this.idDetailPenjualan != other.idDetailPenjualan) {
            return false;
        }
        if (this.idPenjualan != other.idPenjualan) {
            return false;
        }
        if (this.idOnderdil != other.idOnderdil) {
            return false;
        }
        if (this.jumlah != other.jumlah) {
            return false;
        }
        if (this.subTotal != other.subTotal) {
            return false;
        }
        if (!Objects.equals(this.namaOnderdil, other.namaOnderdil)) {
            return false;
        }
        if (!Objects.equals(this.hargaJual, other.hargaJual)) {
            return false;
        }
        if (!Objects.equals(this.stok, other.stok)) {
            return false;
        }
        return true;
    }    
}
