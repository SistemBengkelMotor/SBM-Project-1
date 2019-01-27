/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.model;

import edu.timnas.sistembengkelmotor.entity.Kasir;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author teguhsis
 */
public class TabelKasirModel extends AbstractTableModel{

    private List<Kasir> list = new ArrayList<Kasir>();

    public void setList(List<Kasir> list) {
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
        return 4; // hitung jumlah atribut pada tabel
    }

    public boolean add(Kasir e) {
        try {
            return list.add(e);
        } finally {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    public Kasir get(int index) {
        return list.get(index);
    }

    public Kasir set(int index, Kasir element) {
        try {
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Kasir remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }
    
    

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "ID Kasir";
            case 1: return "Nama Kasir";
            case 2: return "Alamat";
            case 3: return "Telepon";
            default:return null;
        }
    }

    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
//        isi value dari tabel itu sendiri -> setting sesuai valuenya
        switch(columnIndex){
            case 0: return list.get(rowIndex).getIdKasir();
            case 1: return list.get(rowIndex).getNamaKasir();
            case 2: return list.get(rowIndex).getAlamatKasir();
            case 3: return list.get(rowIndex).getNoTelp();
            default: return null;
        }
    }
    
}
