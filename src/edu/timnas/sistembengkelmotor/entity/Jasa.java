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
    
//    2 constructors
    public Jasa(){
        
    }
    public Jasa(String namaJasa) {
        this.namaJasa = namaJasa;
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
//      equals & hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idJasa;
        hash = 79 * hash + Objects.hashCode(this.namaJasa);
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
        if (!Objects.equals(this.namaJasa, other.namaJasa)) {
            return false;
        }
        return true;
    }    
    
}
