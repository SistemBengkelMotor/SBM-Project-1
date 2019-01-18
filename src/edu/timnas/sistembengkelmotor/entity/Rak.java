package edu.timnas.sistembengkelmotor.entity;

import java.util.Objects;

public class Rak {
    
    private int idRak;
    private String lokasi;
    
//  2 Constructors
    public Rak(){
        
    }
    public Rak(String lokasi) {
        this.lokasi = lokasi;
    }
    
// getter & setter    
    public int getIdRak() {
        return idRak;
    }

    public void setIdRak(int idRak) {
        this.idRak = idRak;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
//  equal & hashCode
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.idRak;
        hash = 53 * hash + Objects.hashCode(this.lokasi);
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
        final Rak other = (Rak) obj;
        if (this.idRak != other.idRak) {
            return false;
        }
        if (!Objects.equals(this.lokasi, other.lokasi)) {
            return false;
        }
        return true;
    }
    
    
    
}
