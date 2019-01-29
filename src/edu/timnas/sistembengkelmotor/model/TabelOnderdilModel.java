/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.model;

import edu.timnas.sistembengkelmotor.entity.Onderdil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author teguhsis
 */
public class TabelOnderdilModel extends AbstractTableModel {
    private List<Onderdil> list = new ArrayList<Onderdil>();

    public void setList(List<Onderdil> list) {
        this.list = list;
    }
    
    
    
    @Override
    public int getRowCount() {
//        seberapa panjang rownya
        return list.size(); //jumlah row-nya menyesuaikan dengan jumlah datanya jadi dinamis
    }

    @Override
    public int getColumnCount() {
//        seberapa panjang column-nya
        return 7; // hitung jumlah atribut pada tabel
    }

    public boolean add(Onderdil e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    public Onderdil get(int index) {
        return list.get(index);
    }

    public Onderdil set(int index, Onderdil element) {
        try {
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Onderdil remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }
    
    

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "ID Onderdil";
            case 1: return "ID Kategori";
            case 2: return "ID Rak";
            case 3: return "Nama Onderdil";
            case 4: return "Harga Jual";
            case 5: return "Stok";
            case 6: return "Satuan";
            default:return null;
        }
    }

    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        isi value dari tabel itu sendiri -> setting sesuai valuenya
        switch(columnIndex){
            case 0: return list.get(rowIndex).getIdOnderdil();
            case 1: return list.get(rowIndex).getIdKaton();
            case 2: return list.get(rowIndex).getIdRak();
            case 3: return list.get(rowIndex).getNamaOnderdil();
            case 4: return list.get(rowIndex).getHargaJual();
            case 5: return list.get(rowIndex).getStok();
            case 6: return list.get(rowIndex).getSatuan();
            default: return null;
        }
    }
}
