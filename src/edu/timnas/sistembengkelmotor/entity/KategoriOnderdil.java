
package edu.timnas.sistembengkelmotor.entity;

import java.util.Objects;

public class KategoriOnderdil {
    
    private int idKaton;
    private String namaKaton;
    
//  2 Constructors
    public KategoriOnderdil(){
        
    }
    public KategoriOnderdil(String namaKaton) {
        this.namaKaton = namaKaton;
    }
    
    
    
    public int getIdKaton() {
        return idKaton;
    }

    public void setIdKaton(int idKaton) {
        this.idKaton = idKaton;
    }

    public String getNamaKaton() {
        return namaKaton;
    }

    public void setNamaKaton(String namaKaton) {
        this.namaKaton = namaKaton;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.idKaton;
        hash = 67 * hash + Objects.hashCode(this.namaKaton);
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
        final KategoriOnderdil other = (KategoriOnderdil) obj;
        if (this.idKaton != other.idKaton) {
            return false;
        }
        if (!Objects.equals(this.namaKaton, other.namaKaton)) {
            return false;
        }
        return true;
    }
    
    
    
}
