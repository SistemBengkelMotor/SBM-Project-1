/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.model;

import edu.timnas.sistembengkelmotor.database.SistemBengkelMotorDatabase;
import edu.timnas.sistembengkelmotor.entity.Rak;
import edu.timnas.sistembengkelmotor.error.RakException;
import edu.timnas.sistembengkelmotor.event.RakListener;
import edu.timnas.sistembengkelmotor.service.RakDao;
import java.sql.SQLException;

/**
 *
 * @author teguhsis
 */
public class RakModel {
    private int idRak;
    private String lokasi;
    
    private RakListener listener;

    public RakListener getListener() {
        return listener;
    }

    public void setListener(RakListener listener) {
        this.listener = listener;
    }

    public int getIdRak() {
        return idRak;
    }

    public void setIdRak(int idRak) {
        this.idRak = idRak;
        fireOnChange();
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
        fireOnChange();
    }
    
    
    protected void fireOnChange(){
        if (listener!=null) {
            listener.onChange(this);
        }
    }
    protected void fireOnInsert(Rak rak){
    if (listener!=null) {
            listener.onInsert(rak);
        }
    }
    protected void fireOnUpdate(Rak rak){
    if (listener!=null) {
            listener.onUpdate(rak);
        }
    }
    protected void fireOnDelete(){
    if (listener!=null) {
            listener.onDelete();
        }
    }
    
    public void insertRak() throws SQLException, RakException{
        RakDao dao = SistemBengkelMotorDatabase.getRakDao();
        Rak rak = new Rak();
        
        rak.setLokasi(lokasi);
        
        dao.insertRak(rak);
        fireOnInsert(rak);
    }
    
    public void updateRak() throws SQLException, RakException{
        RakDao dao = SistemBengkelMotorDatabase.getRakDao();
        Rak rak = new Rak();
        
        rak.setLokasi(lokasi);
        rak.setIdRak(idRak);
        
        dao.updateRak(rak);
        fireOnUpdate(rak);
    }
    
    public void deleteRak() throws SQLException, RakException{
        RakDao dao = SistemBengkelMotorDatabase.getRakDao();
        
        dao.deleteRak(idRak);
        fireOnDelete();
    }
    
    public void resetRak(){
        setIdRak(0);
        setLokasi("");
    }
    
}
