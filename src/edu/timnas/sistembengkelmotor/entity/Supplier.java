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
public class Supplier {
    
    private int idSupplier;
    private String namaSupplier;
    private String alamatSupplier;
    private String noTelp;
    
//    2 constructors
    public Supplier(){
        
    }

    public Supplier(String namaSupplier, String alamatSupplier, String noTelp) {
        this.namaSupplier = namaSupplier;
        this.alamatSupplier = alamatSupplier;
        this.noTelp = noTelp;
    }
    
//  getter & setter

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getNamaSupplier() {
        return namaSupplier;
    }

    public void setNamaSupplier(String namaSupplier) {
        this.namaSupplier = namaSupplier;
    }

    public String getAlamatSupplier() {
        return alamatSupplier;
    }

    public void setAlamatSupplier(String alamatSupplier) {
        this.alamatSupplier = alamatSupplier;
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
        hash = 29 * hash + this.idSupplier;
        hash = 29 * hash + Objects.hashCode(this.namaSupplier);
        hash = 29 * hash + Objects.hashCode(this.alamatSupplier);
        hash = 29 * hash + Objects.hashCode(this.noTelp);
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
        final Supplier other = (Supplier) obj;
        if (this.idSupplier != other.idSupplier) {
            return false;
        }
        if (!Objects.equals(this.namaSupplier, other.namaSupplier)) {
            return false;
        }
        if (!Objects.equals(this.alamatSupplier, other.alamatSupplier)) {
            return false;
        }
        if (!Objects.equals(this.noTelp, other.noTelp)) {
            return false;
        }
        return true;
    }
}
