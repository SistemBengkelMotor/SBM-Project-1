/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.controller;

import edu.timnas.sistembengkelmotor.model.KasirModel;
import edu.timnas.sistembengkelmotor.view.KasirView;
import javax.swing.JOptionPane;

/**
 *
 * @author teguhsis
 */
public class KasirController {
    
    private KasirModel model;

    public void setModel(KasirModel model) {
        this.model = model;
    }
    
    public void resetKasir(KasirView view){
         model.resetKasir();
    }
    
    public void insertKasir(KasirView view){
        
        String nama = view.getTxtKasirNama().getText();
        String alamat = view.getTxtKasirAlamat().getText();
        String noTelp = view.getTxtKasirNoTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        }else if (nama.length() > 50) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal 50 digit");
        }else if (alamat.length() > 100) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal alamat 100 digit");
        }else if (noTelp.length() > 16) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal telepon 16 digit");
        }else{
            model.setNamaKasir(nama);
            model.setAlamatKasir(alamat);
            model.setNoTelp(noTelp);
            
            try {
                model.insertKasir();
                JOptionPane.showMessageDialog(view, "Kasir berhasil diambahkan");
                model.resetKasir();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
        
    }
    
    public void updateKasir(KasirView view){
        
        if (view.getTableKasir().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Pilih Record yang akan diubah");
            return;
        }
        
        Integer id = Integer.parseInt(view.getTxtKasirId().getText());
        
        String nama = view.getTxtKasirNama().getText();
        String alamat = view.getTxtKasirAlamat().getText();
        String noTelp = view.getTxtKasirNoTelp().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        }else if (nama.length() > 50) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal 50 digit");
        }else if (alamat.length() > 100) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal alamat 100 digit");
        }else if (noTelp.length() > 16) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal telepon 16 digit");
        }else{
            model.setIdKasir(id);
            model.setNamaKasir(nama);
            model.setAlamatKasir(alamat);
            model.setNoTelp(noTelp);
            
            try {
                model.updateKasir();
                JOptionPane.showMessageDialog(view, "Kasir berhasil diubah");
                model.resetKasir();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }
    
    public void deleteKasir(KasirView view){
        if (view.getTableKasir().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Pilih Record yang akan dihapus");
            return;
        }
        
        if (JOptionPane.showConfirmDialog(view, "Anda yakin akan menghapus ?") == JOptionPane.OK_OPTION) {
            Integer id = Integer.parseInt(view.getTxtKasirId().getText());
            model.setIdKasir(id);
            
            try {
                model.deleteKasir();
                JOptionPane.showMessageDialog(view, "Kasir berhasil dihapus");
                model.resetKasir();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
        
    }
    
}
