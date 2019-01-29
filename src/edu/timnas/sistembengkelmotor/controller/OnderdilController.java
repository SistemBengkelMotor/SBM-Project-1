/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.controller;

import edu.timnas.sistembengkelmotor.model.OnderdilModel;
import edu.timnas.sistembengkelmotor.view.OnderdilView;
import javax.swing.JOptionPane;

/**
 *
 * @author teguhsis
 */
public class OnderdilController {
    private OnderdilModel model;

    public void setModel(OnderdilModel model) {
        this.model = model;
    }
    
    public void resetOnderdil(OnderdilView view){
         model.resetOnderdil();
    }
    
    public void insertOnderdil(OnderdilView view){
        
        String nama = view.getTxtOnderdilNamaOnderdil().getText();
        Integer katon = Integer.parseInt(view.getTxtOnderdilIdKaton().getText());
        Integer rak = Integer.parseInt(view.getTxtOnderdilIdRak().getText());
        Integer hargaJual = Integer.parseInt(view.getTxtOnderdilHarhaJual().getText());
        Integer stok = Integer.parseInt(view.getTxtOnderdilStok().getText());
        String satuan = view.getTxtOnderdilSatuan().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        }else if (nama.length() > 100) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal 100 digit");
        }else if (katon.equals(0)) {
            JOptionPane.showMessageDialog(view, "ID Kategori tidak boleh kosong");
        }else if (satuan.length() > 100) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal alamat 30 digit");
        }else{
            model.setNamaOnderdil(nama);
            model.setIdKaton(katon);
            model.setIdRak(rak);
            model.setNamaOnderdil(nama);
            model.setHargaJual(hargaJual);
            model.setStok(stok);
            model.setSatuan(satuan);
            
            try {
                model.insertOnderdil();
                JOptionPane.showMessageDialog(view, "Onderdil berhasil diambahkan");
                model.resetOnderdil();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
        
    }
    
    public void updateOnderdil(OnderdilView view){
        
        if (view.getTableOnderdil().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Pilih Record yang akan diubah");
            return;
        }
        
        Integer id = Integer.parseInt(view.getTxtOnderdilId().getText());
        
        Integer katon = Integer.parseInt(view.getTxtOnderdilIdKaton().getText());
        Integer rak = Integer.parseInt(view.getTxtOnderdilIdRak().getText());
        String nama = view.getTxtOnderdilNamaOnderdil().getText();
        Integer hargaJual = Integer.parseInt(view.getTxtOnderdilHarhaJual().getText());
        Integer stok = Integer.parseInt(view.getTxtOnderdilStok().getText());
        String satuan = view.getTxtOnderdilSatuan().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        }else if (nama.length() > 100) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal 100 digit");
        }else if (satuan.length() > 100) {
            JOptionPane.showMessageDialog(view, "Panjang maksimal alamat 30 digit");
        }else{
            model.setIdOnderdil(id);
            model.setNamaOnderdil(nama);
            model.setIdKaton(katon);
            model.setIdRak(rak);
            model.setNamaOnderdil(nama);
            model.setHargaJual(hargaJual);
            model.setStok(stok);
            model.setSatuan(satuan);
            
            try {
                model.updateOnderdil();
                JOptionPane.showMessageDialog(view, "Onderdil berhasil diubah");
                model.resetOnderdil();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }
    
    public void deleteOnderdil(OnderdilView view){
        if (view.getTableOnderdil().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Pilih Record yang akan dihapus");
            return;
        }
        
        if (JOptionPane.showConfirmDialog(view, "Anda yakin akan menghapus ?") == JOptionPane.OK_OPTION) {
            Integer id = Integer.parseInt(view.getTxtOnderdilId().getText());
            model.setIdOnderdil(id);
            
            try {
                model.deleteOnderdil();
                JOptionPane.showMessageDialog(view, "Onderdil berhasil dihapus");
                model.resetOnderdil();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
        
    }
}
