/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.controller;

import edu.timnas.sistembengkelmotor.model.RakModel;
import edu.timnas.sistembengkelmotor.view.RakView;
import javax.swing.JOptionPane;

/**
 *
 * @author teguhsis
 */
public class RakController {
    private RakModel model;

    public void setModel(RakModel model) {
        this.model = model;
    }
    
    public void resetRak(RakView view){
         model.resetRak();
    }
    
    public void insertRak(RakView view){
        
        String lokasi = view.getTxtRakLokasi().getText();
        
        if (lokasi.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Lokasi tidak boleh kosong");
        }else if (lokasi.length() > 50) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal 50 digit");
        }else{
            model.setLokasi(lokasi);
            
            try {
                model.insertRak();
                JOptionPane.showMessageDialog(view, "Rak berhasil diambahkan");
                model.resetRak();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
        
    }
    
    public void updateRak(RakView view){
        
        if (view.getTableRak().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Pilih Record yang akan diubah");
            return;
        }
        
        Integer id = Integer.parseInt(view.getTxtRakId().getText());
        
        String lokasi = view.getTxtRakLokasi().getText();
        
        if (lokasi.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Loksi tidak boleh kosong");
        }else if (lokasi.length() > 50) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal 50 digit");
        }else{
            model.setIdRak(id);
            model.setLokasi(lokasi);
            
            try {
                model.updateRak();
                JOptionPane.showMessageDialog(view, "Rak berhasil diubah");
                model.resetRak();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }
    
    public void deleteRak(RakView view){
        if (view.getTableRak().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Pilih Record yang akan dihapus");
            return;
        }
        
        if (JOptionPane.showConfirmDialog(view, "Anda yakin akan menghapus ?") == JOptionPane.OK_OPTION) {
            Integer id = Integer.parseInt(view.getTxtRakId().getText());
            model.setIdRak(id);
            
            try {
                model.deleteRak();
                JOptionPane.showMessageDialog(view, "Rak berhasil dihapus");
                model.resetRak();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
        
    }
}
