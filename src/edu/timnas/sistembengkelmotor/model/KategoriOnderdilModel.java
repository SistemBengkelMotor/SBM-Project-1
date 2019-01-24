/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.model;

import edu.timnas.sistembengkelmotor.database.SistemBengkelMotorDatabase;
import edu.timnas.sistembengkelmotor.entity.KategoriOnderdil;
import edu.timnas.sistembengkelmotor.error.KategoriOnderdilException;
import edu.timnas.sistembengkelmotor.event.KategoriOnderdilListener;
import edu.timnas.sistembengkelmotor.service.KategoriOnderdilDao;
import java.sql.SQLException;

/**
 *
 * @author teguhsis
 */
public class KategoriOnderdilModel {
    
    private int idKaton;
    private String namaKaton;

    private KategoriOnderdilListener listener;
    
//    getter & setter *tambahan dari listener
    public KategoriOnderdilListener getListener() {    
        return listener;
    }
    public void setListener(KategoriOnderdilListener listener) {    
        this.listener = listener;
    }

//    getter & setter
    public int getIdKaton() {
        return idKaton;
    }

    public void setIdKaton(int idKaton) {
        this.idKaton = idKaton;
        fireOnChange();
    }

    public String getNamaKaton() {
        return namaKaton;
    }

    public void setNamaKaton(String namaKaton) {
        this.namaKaton = namaKaton;
        fireOnChange();
    }
    
    
//    CRUD
    protected void fireOnChange(){
        if (listener != null) {
            listener.onChange(this);
        }
    }
    protected void fireOnInsert(KategoriOnderdil kategoriOnderdil){
        if (listener != null) {
            listener.onInsert(kategoriOnderdil);
        }
    }
    protected void fireOnUpdate(KategoriOnderdil kategoriOnderdil){
        if (listener != null) {
            listener.onUpdate(kategoriOnderdil);
        }
    }
    protected void fireOnDelete(){
        if (listener != null) {
            listener.onDelete();
        }
    }
    
//  hampir sama seperti testing namu *ditambah fireOn.... di akhir
//    fungsi dari tombol(pada bagian View) yg akan digunakan di Controller
    public void insertKategoriOnderdil() throws SQLException, KategoriOnderdilException{
        KategoriOnderdilDao dao = SistemBengkelMotorDatabase.getKategoriOnderdilDao();
        KategoriOnderdil kategoriOnderdil = new KategoriOnderdil();
        
        kategoriOnderdil.setNamaKaton(namaKaton);
        
        dao.insertKategoriOnderdil(kategoriOnderdil);
        fireOnInsert(kategoriOnderdil);
    }
    
    public void updateKategoriOnderdil() throws SQLException, KategoriOnderdilException{
        KategoriOnderdilDao dao = SistemBengkelMotorDatabase.getKategoriOnderdilDao();
        KategoriOnderdil kategoriOnderdil = new KategoriOnderdil();
        
        kategoriOnderdil.setNamaKaton(namaKaton);
        kategoriOnderdil.setIdKaton(idKaton);
        
        dao.updateKategoriOnderdil(kategoriOnderdil);
        fireOnUpdate(kategoriOnderdil);
    }
    
    public void deleteKategoriOnderdil() throws SQLException, KategoriOnderdilException{
        KategoriOnderdilDao dao = SistemBengkelMotorDatabase.getKategoriOnderdilDao();
        
        dao.deleteKategoriOnderdil(idKaton);
        fireOnDelete();
    }
    
    public void resetKategoriOnderdil(){
        setIdKaton(0);
        setNamaKaton("");
    }
    
}
