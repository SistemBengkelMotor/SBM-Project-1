/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.entity;

/**
 *
 * @author teguhsis
 */
public class Type {
    
    private int idType;
    private int idMerk;
    
//   2 constructors
    public Type(){
        
    }
    public Type(int idMerk) {
        this.idMerk = idMerk;
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
    
//  equals & hashCode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.idType;
        hash = 61 * hash + this.idMerk;
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
        return true;
    }
}
