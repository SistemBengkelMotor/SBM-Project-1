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
public class Merk {
   
    private int idMerk;
    private String namaMerk;
    
//  2  constructor
    public Merk(){
        
    }
    public Merk(String namaMerk) {
        this.namaMerk = namaMerk;
    }
    
//    getter & setter semua variabel

    public int getIdMerk() {
        return idMerk;
    }

    public void setIdMerk(int idMerk) {
        this.idMerk = idMerk;
    }

    public String getNamaMerk() {
        return namaMerk;
    }

    public void setNamaMerk(String namaMerk) {
        this.namaMerk = namaMerk;
    }

//  equals & hashCode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.idMerk;
        hash = 89 * hash + Objects.hashCode(this.namaMerk);
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
        final Merk other = (Merk) obj;
        if (this.idMerk != other.idMerk) {
            return false;
        }
        if (!Objects.equals(this.namaMerk, other.namaMerk)) {
            return false;
        }
        return true;
    }
    
}
