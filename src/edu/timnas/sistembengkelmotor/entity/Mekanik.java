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
public class Mekanik {
 
    private int idMekanik;
    private String namaMekanik;
    
//    constructor
    public Mekanik() {
        
    }
    public Mekanik(String namaMekanik){
        this.namaMekanik = namaMekanik;
    }
    
//  getter & setter

    public int getIdMekanik() {
        return idMekanik;
    }

    public void setIdMekanik(int idMekanik) {
        this.idMekanik = idMekanik;
    }

    public String getNamaMekanik() {
        return namaMekanik;
    }

    public void setNamaMekanik(String namaMekanik) {
        this.namaMekanik = namaMekanik;
    }
    
//    equals & hash code
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.idMekanik;
        hash = 47 * hash + Objects.hashCode(this.namaMekanik);
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
        final Mekanik other = (Mekanik) obj;
        if (this.idMekanik != other.idMekanik) {
            return false;
        }
        if (!Objects.equals(this.namaMekanik, other.namaMekanik)) {
            return false;
        }
        return true;
    }
    
}
