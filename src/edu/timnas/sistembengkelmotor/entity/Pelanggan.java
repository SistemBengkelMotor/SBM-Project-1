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
public class Pelanggan {
    
    private int idPelanggan;
    private String namaPelanggan;
    private String noTelp;
    
//    2 constructors
    public Pelanggan(){
        
    }
    public Pelanggan(String namaPelanggan, String noTelp) {
        this.namaPelanggan = namaPelanggan;
        this.noTelp = noTelp;
    }
    
//    getter & setter

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
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
        int hash = 5;
        hash = 17 * hash + this.idPelanggan;
        hash = 17 * hash + Objects.hashCode(this.namaPelanggan);
        hash = 17 * hash + Objects.hashCode(this.noTelp);
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
        final Pelanggan other = (Pelanggan) obj;
        if (this.idPelanggan != other.idPelanggan) {
            return false;
        }
        if (!Objects.equals(this.namaPelanggan, other.namaPelanggan)) {
            return false;
        }
        if (!Objects.equals(this.noTelp, other.noTelp)) {
            return false;
        }
        return true;
    }    
}
