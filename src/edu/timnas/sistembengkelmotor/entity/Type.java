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
public class Type {
    
    private int idType;
    private int idMerk;
    private String jenisType;
    
//   2 constructors
    public Type(){
        
    }
    public Type(int idMerk, String jenisType) {
        this.idMerk = idMerk;
        this.jenisType = jenisType;
    }
    
    
//  getter & setter (semua variabel)

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public int getIdMerk() {
        return idMerk;
    }

    public void setIdMerk(int idMerk) {
        this.idMerk = idMerk;
    }

    public String getJenisType() {
        return jenisType;
    }

    public void setJenisType(String jenisType) {
        this.jenisType = jenisType;
    }
    
//  equals & hashCode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.idType;
        hash = 97 * hash + this.idMerk;
        hash = 97 * hash + Objects.hashCode(this.jenisType);
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
        final Type other = (Type) obj;
        if (this.idType != other.idType) {
            return false;
        }
        if (this.idMerk != other.idMerk) {
            return false;
        }
        if (!Objects.equals(this.jenisType, other.jenisType)) {
            return false;
        }
        return true;
    }

    
}
