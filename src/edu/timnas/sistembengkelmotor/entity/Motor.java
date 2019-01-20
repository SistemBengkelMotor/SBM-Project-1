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
public class Motor {
    
    private String nopol;
    private int idType;
// untuk tabel kombinasi
    private String jenisType; 
    private String namaMerk;
    
//    2 costructors
    public Motor(){
        
    }
    public Motor(int idType) {
        this.idType = idType;
    }
    
//    getter & setter

    public String getNopol() {
        return nopol;
    }

    public void setNopol(String nopol) {
        this.nopol = nopol;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getJenisType() {
        return jenisType;
    }

    public void setJenisType(String jenisType) {
        this.jenisType = jenisType;
    }

    public String getNamaMerk() {
        return namaMerk;
    }

    public void setNamaMerk(String namaMerk) {
        this.namaMerk = namaMerk;
    }
    
//    equals & hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nopol);
        hash = 23 * hash + this.idType;
        hash = 23 * hash + Objects.hashCode(this.jenisType);
        hash = 23 * hash + Objects.hashCode(this.namaMerk);
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
        final Motor other = (Motor) obj;
        if (this.idType != other.idType) {
            return false;
        }
        if (!Objects.equals(this.nopol, other.nopol)) {
            return false;
        }
        if (!Objects.equals(this.jenisType, other.jenisType)) {
            return false;
        }
        if (!Objects.equals(this.namaMerk, other.namaMerk)) {
            return false;
        }
        return true;
    }
    
}
