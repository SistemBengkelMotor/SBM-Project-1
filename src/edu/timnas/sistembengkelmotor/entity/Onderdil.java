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
public class Onderdil {
    
    private int idOnderdil;
    private int idKaton;
    private int idRak;
    private String namaOnderdil;
    private int hargaJual;
    private int stok;
    private String satuan;
    // untuk tabel kombinasi
    private String namaKaton;
    private String lokasi;
    
//    2 constructors
    public Onderdil(){
        
    }
    public Onderdil(int idKaton, int idRak, String namaOnderdil, int hargaJual, int stok, String satuan, String namaKaton, String lokasi) {
        this.idKaton = idKaton;
        this.idRak = idRak;
        this.namaOnderdil = namaOnderdil;
        this.hargaJual = hargaJual;
        this.stok = stok;
        this.satuan = satuan;
        this.namaKaton = namaKaton;
        this.lokasi = lokasi;
    }
    
//    getter & setter
    public int getIdOnderdil() {
        return idOnderdil;
    }

    public void setIdOnderdil(int idOnderdil) {
        this.idOnderdil = idOnderdil;
    }

    public int getIdKaton() {
        return idKaton;
    }

    public void setIdKaton(int idKaton) {
        this.idKaton = idKaton;
    }

    public int getIdRak() {
        return idRak;
    }

    public void setIdRak(int idRak) {
        this.idRak = idRak;
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

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getNamaKaton() {
        return namaKaton;
    }

    public void setNamaKaton(String namaKaton) {
        this.namaKaton = namaKaton;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

//    equals & hashCode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + this.idOnderdil;
        hash = 73 * hash + this.idKaton;
        hash = 73 * hash + this.idRak;
        hash = 73 * hash + Objects.hashCode(this.namaOnderdil);
        hash = 73 * hash + this.hargaJual;
        hash = 73 * hash + this.stok;
        hash = 73 * hash + Objects.hashCode(this.satuan);
        hash = 73 * hash + Objects.hashCode(this.namaKaton);
        hash = 73 * hash + Objects.hashCode(this.lokasi);
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
        final Onderdil other = (Onderdil) obj;
        if (this.idOnderdil != other.idOnderdil) {
            return false;
        }
        if (this.idKaton != other.idKaton) {
            return false;
        }
        if (this.idRak != other.idRak) {
            return false;
        }
        if (this.hargaJual != other.hargaJual) {
            return false;
        }
        if (this.stok != other.stok) {
            return false;
        }
        if (!Objects.equals(this.namaOnderdil, other.namaOnderdil)) {
            return false;
        }
        if (!Objects.equals(this.satuan, other.satuan)) {
            return false;
        }
        if (!Objects.equals(this.namaKaton, other.namaKaton)) {
            return false;
        }
        if (!Objects.equals(this.lokasi, other.lokasi)) {
            return false;
        }
        return true;
    }    
}
