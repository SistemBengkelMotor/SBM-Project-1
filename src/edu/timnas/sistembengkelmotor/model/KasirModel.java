/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.model;

import edu.timnas.sistembengkelmotor.database.SistemBengkelMotorDatabase;
import edu.timnas.sistembengkelmotor.entity.Kasir;
import edu.timnas.sistembengkelmotor.error.KasirException;
import edu.timnas.sistembengkelmotor.event.KasirListener;
import edu.timnas.sistembengkelmotor.service.KasirDao;
import java.sql.SQLException;

/**
 *
 * @author teguhsis
 */
public class KasirModel {
    
    private int idKasir;
    private String namaKasir;
    private String alamatKasir;
    private String noTelp;

    private KasirListener listener;

    public KasirListener getListener() {
        return listener;
    }

    public void setListener(KasirListener listener) {
        this.listener = listener;
    }
    
    
    
    public int getIdKasir() {
        return idKasir;
    }

    public void setIdKasir(int idKasir) {
        this.idKasir = idKasir;
        fireOnChange();
    }

    public String getNamaKasir() {
        return namaKasir;
    }

    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
        fireOnChange();
    }

    public String getAlamatKasir() {
        return alamatKasir;
    }

    public void setAlamatKasir(String alamatKasir) {
        this.alamatKasir = alamatKasir;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if (listener!=null) {
            listener.onChange(this);
        }
    }
    protected void fireOnInsert(Kasir kasir){
    if (listener!=null) {
            listener.onInsert(kasir);
        }
    }
    protected void fireOnUpdate(Kasir kasir){
    if (listener!=null) {
            listener.onUpdate(kasir);
        }
    }
    protected void fireOnDelete(){
    if (listener!=null) {
            listener.onDelete();
        }
    }
    
    public void insertKasir() throws SQLException, KasirException{
        KasirDao dao = SistemBengkelMotorDatabase.getKasirDao();
        Kasir kasir = new Kasir();
        
        kasir.setNamaKasir(namaKasir);
        kasir.setAlamatKasir(alamatKasir);
        kasir.setNoTelp(noTelp);
        
        dao.insertKasir(kasir);
        fireOnInsert(kasir);
    }
    
    public void updateKasir() throws SQLException, KasirException{
        KasirDao dao = SistemBengkelMotorDatabase.getKasirDao();
        Kasir kasir = new Kasir();
        
        kasir.setNamaKasir(namaKasir);
        kasir.setAlamatKasir(alamatKasir);
        kasir.setNoTelp(noTelp);
        kasir.setIdKasir(idKasir);
        
        dao.updateKasir(kasir);
        fireOnUpdate(kasir);
    }
    
    public void deleteKasir() throws SQLException, KasirException{
        KasirDao dao = SistemBengkelMotorDatabase.getKasirDao();
        
        dao.deleteKasir(idKasir);
        fireOnDelete();
    }
    
    public void resetKasir(){
        setIdKasir(0);
        setNamaKasir("");
        setAlamatKasir("");
        setNoTelp("");
    }

    
}
