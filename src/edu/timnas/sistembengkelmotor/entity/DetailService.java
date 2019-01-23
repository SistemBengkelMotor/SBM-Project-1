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
public class DetailService {
    
    private int idDetailService;
    private int idService;
    private int idJasa;
    private int idOnderdil;
    private int jumlah;
    private int subTotalHarga;
    //    untuk kombinasi
    private String namaOnderdil;
    private int hargaJual;
    private String namaJasa;
    private int hargaJasa;
    
//    2 constructors
    public DetailService(){
        
    }
    public DetailService(int idService, int idJasa, int idOnderdil, int jumlah, int subTotalHarga, String namaOnderdil, int hargaJual, String namaJasa, int hargaJasa) {
        this.idService = idService;
        this.idJasa = idJasa;
        this.idOnderdil = idOnderdil;
        this.jumlah = jumlah;
        this.subTotalHarga = subTotalHarga;
        this.namaOnderdil = namaOnderdil;
        this.hargaJual = hargaJual;
        this.namaJasa = namaJasa;
        this.hargaJasa = hargaJasa;
    }
    
    
//    getter & setter

    public int getIdDetailService() {
        return idDetailService;
    }

    public void setIdDetailService(int idDetailService) {
        this.idDetailService = idDetailService;
    }

    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public int getIdJasa() {
        return idJasa;
    }

    public void setIdJasa(int idJasa) {
        this.idJasa = idJasa;
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

    public int getSubTotalHarga() {
        return subTotalHarga;
    }

    public void setSubTotalHarga(int subTotalHarga) {
        this.subTotalHarga = subTotalHarga;
    }

    public String getNamaOnderdil() {
        return namaOnderdil;
    }

    public void setNamaOnderdil(String namaOnderdil) {
        this.namaOnderdil = namaOnderdil;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    public String getNamaJasa() {
        return namaJasa;
    }

    public void setNamaJasa(String namaJasa) {
        this.namaJasa = namaJasa;
    }

    public int getHargaJasa() {
        return hargaJasa;
    }

    public void setHargaJasa(int hargaJasa) {
        this.hargaJasa = hargaJasa;
    }
    
//    equals & hashCode
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.idDetailService;
        hash = 53 * hash + this.idService;
        hash = 53 * hash + this.idJasa;
        hash = 53 * hash + this.idOnderdil;
        hash = 53 * hash + this.jumlah;
        hash = 53 * hash + this.subTotalHarga;
        hash = 53 * hash + Objects.hashCode(this.namaOnderdil);
        hash = 53 * hash + this.hargaJual;
        hash = 53 * hash + Objects.hashCode(this.namaJasa);
        hash = 53 * hash + this.hargaJasa;
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
        final DetailService other = (DetailService) obj;
        if (this.idDetailService != other.idDetailService) {
            return false;
        }
        if (this.idService != other.idService) {
            return false;
        }
        if (this.idJasa != other.idJasa) {
            return false;
        }
        if (this.idOnderdil != other.idOnderdil) {
            return false;
        }
        if (this.jumlah != other.jumlah) {
            return false;
        }
        if (this.subTotalHarga != other.subTotalHarga) {
            return false;
        }
        if (this.hargaJual != other.hargaJual) {
            return false;
        }
        if (this.hargaJasa != other.hargaJasa) {
            return false;
        }
        if (!Objects.equals(this.namaOnderdil, other.namaOnderdil)) {
            return false;
        }
        if (!Objects.equals(this.namaJasa, other.namaJasa)) {
            return false;
        }
        return true;
    }    
}
