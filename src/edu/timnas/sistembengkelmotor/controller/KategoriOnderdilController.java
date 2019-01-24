/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.controller;

import edu.timnas.sistembengkelmotor.model.KategoriOnderdilModel;
import edu.timnas.sistembengkelmotor.view.KategoriOnderdilView;
import javax.swing.JOptionPane;

/**
 *  Mengimplementasi method yang akan dieksekusi di bagian View
 * @author teguhsis
 */
public class KategoriOnderdilController {
    
    private KategoriOnderdilModel model;

//    setter
    public void setModel(KategoriOnderdilModel model) {
        this.model = model;
    }
    
//    pasang parameter view(di bagian controller ini menghubungkan Model dan View)
    public void resetKategoriOnderdil(KategoriOnderdilView view){
        model.resetKategoriOnderdil();
    }
    public void insertKategoriOnderdil(KategoriOnderdilView view){
        String nama = view.getTxtKatonNama().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Kategori tidak boleh kosong");
        }else if (nama.length()>100) {
            JOptionPane.showMessageDialog(view, "Digit Nama Kategori tidak lebih dari 100 karakter");
        }else{
            
            model.setNamaKaton(nama);
            
            try {
                model.insertKategoriOnderdil();
                JOptionPane.showMessageDialog(view, "Input data Kategori Berhasil");
                model.resetKategoriOnderdil();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
            
        }
        
    }
    
/*  di update ini: kita menggunakan penanda untuk mengambil datanya, jadi misalkan kita lihat ke bagian UX-nya
    btUbah baru bisa kalau kita mengklik dahulu record yang akan diubah (jadi kalau langsung klik btnUbah maka 
    ada peringatan bahwa harus mengklik dahulu salah satu record mana yang mau diubah) */    
    public void updateKategoriOnderdil(KategoriOnderdilView view){
        
        if (view.getTableKaton().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Klik dahulu record yang akan di-update");
            return;
        }
        
        // tambahan khusu untukk fungsi-update
        Integer id = Integer.parseInt(view.getTxtKatonId().getText());
        
        String nama = view.getTxtKatonNama().getText();
        
        if (nama.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Kategori tidak boleh kosong");
        }else if (nama.length()>100) {
            JOptionPane.showMessageDialog(view, "Digit Nama Kategori tidak lebih dari 100 karakter");
        }else{
            
            model.setIdKaton(id);
            model.setNamaKaton(nama);
            
            try {
                model.updateKategoriOnderdil();
                JOptionPane.showMessageDialog(view, "Update data Kategori Berhasil");
                model.resetKategoriOnderdil();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
            
        }
    }
    
    public void deleteKategoriOnderdil(KategoriOnderdilView view){
        
        if (view.getTableKaton().getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(view, "Klik dahulu record yang akan di-delete");
            return;
        }
        
        //  konfirmasi penghapusan data
        if (JOptionPane.showConfirmDialog(view, "Delete data dengan ID "+model.getIdKaton()+" ?") == JOptionPane.OK_OPTION) {
            Integer id = Integer.parseInt(view.getTxtKatonId().getText());
            model.setIdKaton(id);
            
            try {
                model.deleteKategoriOnderdil();
                JOptionPane.showMessageDialog(view, "Delete data Kategori Berhasil");
                model.resetKategoriOnderdil();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
            
        }
        
    }
    
}
