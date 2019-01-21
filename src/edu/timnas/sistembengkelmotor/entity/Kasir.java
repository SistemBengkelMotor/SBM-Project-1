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
public class Kasir {
    
    private int idKasir;
    private String namaKasir;
    private String alamatKasir;
    private String noTelp;
    
//    2 constructors
    public Kasir(){
        
    }
    public Kasir(String namaKasir, String alamatKasir, String noTelp) {
        this.namaKasir = namaKasir;
        this.alamatKasir = alamatKasir;
        this.noTelp = noTelp;
    }
    
//    getter & setter
    public int getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(int idKasir) {
        this.idKasir = idKasir;
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }

    public String getAlamatKasir() {
        return alamatKasir;
    }

    public void setAlamatKasir(String alamatKasir) {
        this.alamatKasir = alamatKasir;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    
//  equals & hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idKasir;
        hash = 79 * hash + Objects.hashCode(this.namaKasir);
        hash = 79 * hash + Objects.hashCode(this.alamatKasir);
        hash = 79 * hash + Objects.hashCode(this.noTelp);
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
        final Kasir other = (Kasir) obj;
        if (this.idKasir != other.idKasir) {
            return false;
        }
        if (!Objects.equals(this.namaKasir, other.namaKasir)) {
            return false;
        }
        if (!Objects.equals(this.alamatKasir, other.alamatKasir)) {
            return false;
        }
        if (!Objects.equals(this.noTelp, other.noTelp)) {
            return false;
        }
        return true;
    }    
}
