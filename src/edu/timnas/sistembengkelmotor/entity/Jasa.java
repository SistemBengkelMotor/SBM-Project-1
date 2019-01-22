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
public class Jasa {
    
    private int idJasa;
    private String namaJasa;
    private int hargaJasa;
    
//    2 constructors
    public Jasa(){
        
    }
    public Jasa(String namaJasa, int hargaJasa) {
        this.namaJasa = namaJasa;
        this.hargaJasa = hargaJasa;
    }
    
//    getter & setter
    public int getIdJasa() {
        return idJasa;
    }

    public void setIdJasa(int idJasa) {
        this.idJasa = idJasa;
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
    
//      equals & hashCode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.idJasa;
        hash = 61 * hash + Objects.hashCode(this.namaJasa);
        hash = 61 * hash + this.hargaJasa;
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
        final Jasa other = (Jasa) obj;
        if (this.idJasa != other.idJasa) {
            return false;
        }
        if (this.hargaJasa != other.hargaJasa) {
            return false;
        }
        if (!Objects.equals(this.namaJasa, other.namaJasa)) {
            return false;
        }
        return true;
    }    
}
