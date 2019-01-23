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
public class Service {
    
    private int idService;
    private int idMekanik;
    private String nopol;
    private int idPelanggan;
    private int idKasir;
    private String tglService;
    private String tglSelesai;
    private int totalHarga;
    private int bayar;
    private int kembalian;
    //    untuk kombinasi
    private String namaMekanik;
    private String namaPelanggan;
    private String namaKasir;
    private int idType;
    
    
//    2 constructors
    public Service(){
        
    }
    public Service(int idMekanik, String nopol, int idPelanggan, int idKasir, String tglService, String tglSelesai, int totalHarga, int bayar, int kembalian, String namaMekanik, String namaPelanggan, String namaKasir, int idType) {
        this.idMekanik = idMekanik;
        this.nopol = nopol;
        this.idPelanggan = idPelanggan;
        this.idKasir = idKasir;
        this.tglService = tglService;
        this.tglSelesai = tglSelesai;
        this.totalHarga = totalHarga;
        this.bayar = bayar;
        this.kembalian = kembalian;
        this.namaMekanik = namaMekanik;
        this.namaPelanggan = namaPelanggan;
        this.namaKasir = namaKasir;
        this.idType = idType;
    }
    
//    getter & setter
    public int getIdService() {
        return idService;
    }

    public void setIdService(int idService) {
        this.idService = idService;
    }

    public int getIdMekanik() {
        return idMekanik;
    }

    public void setIdMekanik(int idMekanik) {
        this.idMekanik = idMekanik;
    }

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public int getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(int idKasir) {
        this.idKasir = idKasir;
    }

    public String getTglService() {
        return tglService;
    }

    public void setTglService(String tglService) {
        this.tglService = tglService;
    }

    public String getTglSelesai() {
        return tglSelesai;
    }

    public void setTglSelesai(String tglSelesai) {
        this.tglSelesai = tglSelesai;
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

    public String getNamaMekanik() {
        return namaMekanik;
    }

    public void setNamaMekanik(String namaMekanik) {
        this.namaMekanik = namaMekanik;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }
    
//    equals & hashCode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.idService;
        hash = 19 * hash + this.idMekanik;
        hash = 19 * hash + Objects.hashCode(this.nopol);
        hash = 19 * hash + this.idPelanggan;
        hash = 19 * hash + this.idKasir;
        hash = 19 * hash + Objects.hashCode(this.tglService);
        hash = 19 * hash + Objects.hashCode(this.tglSelesai);
        hash = 19 * hash + this.totalHarga;
        hash = 19 * hash + this.bayar;
        hash = 19 * hash + this.kembalian;
        hash = 19 * hash + Objects.hashCode(this.namaMekanik);
        hash = 19 * hash + Objects.hashCode(this.namaPelanggan);
        hash = 19 * hash + Objects.hashCode(this.namaKasir);
        hash = 19 * hash + this.idType;
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
        final Service other = (Service) obj;
        if (this.idService != other.idService) {
            return false;
        }
        if (this.idMekanik != other.idMekanik) {
            return false;
        }
        if (this.idPelanggan != other.idPelanggan) {
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
        if (this.idType != other.idType) {
            return false;
        }
        if (!Objects.equals(this.nopol, other.nopol)) {
            return false;
        }
        if (!Objects.equals(this.tglService, other.tglService)) {
            return false;
        }
        if (!Objects.equals(this.tglSelesai, other.tglSelesai)) {
            return false;
        }
        if (!Objects.equals(this.namaMekanik, other.namaMekanik)) {
            return false;
        }
        if (!Objects.equals(this.namaPelanggan, other.namaPelanggan)) {
            return false;
        }
        if (!Objects.equals(this.namaKasir, other.namaKasir)) {
            return false;
        }
        return true;
    }
  
}
