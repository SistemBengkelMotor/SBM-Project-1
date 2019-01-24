/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.model;

import edu.timnas.sistembengkelmotor.entity.KategoriOnderdil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author teguhsis
 */
public class TabelKategoriOnderdilModel extends AbstractTableModel{
    
    private List<KategoriOnderdil> list = new ArrayList<KategoriOnderdil>();

    public void setList(List<KategoriOnderdil> list) {
        this.list = list;
    }
    
    
    
//    hasil override
    @Override
    public int getRowCount() {
        return list.size();
    }
    
//  delegate
    @Override
    public int getColumnCount() {
        return 2;
    }

    public boolean add(KategoriOnderdil e) {
        try {
            return list.add(e); 
        } finally {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    public KategoriOnderdil get(int index) {
        return list.get(index);
    }

    public KategoriOnderdil set(int index, KategoriOnderdil element) {
        try {
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public KategoriOnderdil remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    
//    hasil override
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "ID Kategori";
            case 1: return "Nama Kategori";
            
            default: return null;
        }
    }

    
    
//    hasil override
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return  list.get(rowIndex).getIdKaton();
            case 1: return  list.get(rowIndex).getNamaKaton();
            
            default:return null;
        }
        
    }    
}
