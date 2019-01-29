/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.model;

import edu.timnas.sistembengkelmotor.database.SistemBengkelMotorDatabase;
import edu.timnas.sistembengkelmotor.entity.Onderdil;
import edu.timnas.sistembengkelmotor.error.OnderdilException;
import edu.timnas.sistembengkelmotor.event.OnderdilListener;
import edu.timnas.sistembengkelmotor.service.OnderdilDao;
import java.sql.SQLException;

/**
 *
 * @author teguhsis
 */
public class OnderdilModel {
    private int idOnderdil;
    private int idKaton;
    private int idRak;
    private String namaOnderdil;
    private int hargaJual;
    private int stok;
    private String satuan;

    private OnderdilListener listener;

    public OnderdilListener getListener() {
        return listener;
    }

    public void setListener(OnderdilListener listener) {
        this.listener = listener;
    }

    
    
    public int getIdOnderdil() {
        return idOnderdil;
    }

    public void setIdOnderdil(int idOnderdil) {
        this.idOnderdil = idOnderdil;
        fireOnChange();
    }

    public int getIdKaton() {
        return idKaton;
    }

    public void setIdKaton(int idKaton) {
        this.idKaton = idKaton;
        fireOnChange();
    }

    public int getIdRak() {
        return idRak;
    }

    public void setIdRak(int idRak) {
        this.idRak = idRak;
        fireOnChange();
    }

    public String getNamaOnderdil() {
        return namaOnderdil;
    }

    public void setNamaOnderdil(String namaOnderdil) {
        this.namaOnderdil = namaOnderdil;
        fireOnChange();
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
        fireOnChange();
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
        fireOnChange();
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
        fireOnChange();
    }
    
    
    
    
    
    protected void fireOnChange(){
        if (listener!=null) {
            listener.onChange(this);
        }
    }
    protected void fireOnInsert(Onderdil onderdil){
    if (listener!=null) {
            listener.onInsert(onderdil);
        }
    }
    protected void fireOnUpdate(Onderdil onderdil){
    if (listener!=null) {
            listener.onUpdate(onderdil);
        }
    }
    protected void fireOnDelete(){
    if (listener!=null) {
            listener.onDelete();
        }
    }
    
    public void insertOnderdil() throws SQLException, OnderdilException{
        OnderdilDao dao = SistemBengkelMotorDatabase.getOnderdilDao();
        Onderdil onderdil = new Onderdil();
        
        onderdil.setIdKaton(idKaton);
        onderdil.setIdRak(idRak);
        onderdil.setNamaOnderdil(namaOnderdil);
        onderdil.setHargaJual(hargaJual);
        onderdil.setStok(stok);
        onderdil.setSatuan(satuan);
        
        dao.insertOnderdil(onderdil);
        fireOnInsert(onderdil);
    }
    
    public void updateOnderdil() throws SQLException, OnderdilException{
        OnderdilDao dao = SistemBengkelMotorDatabase.getOnderdilDao();
        Onderdil onderdil = new Onderdil();
        
        onderdil.setIdKaton(idKaton);
        onderdil.setIdRak(idRak);
        onderdil.setNamaOnderdil(namaOnderdil);
        onderdil.setHargaJual(hargaJual);
        onderdil.setStok(stok);
        onderdil.setSatuan(satuan);
        
        dao.updateOnderdil(onderdil);
        fireOnUpdate(onderdil);
    }
    
    public void deleteOnderdil() throws SQLException, OnderdilException{
        OnderdilDao dao = SistemBengkelMotorDatabase.getOnderdilDao();
        
        dao.deleteOnderdil(idOnderdil);
        fireOnDelete();
    }
    
    public void resetOnderdil(){
        setIdOnderdil(0);
         setIdKaton(0);
         setIdRak(0);
         setNamaOnderdil("");
         setHargaJual(0);
         setStok(0);
         setSatuan("");
    }
}
