/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.model;

import edu.timnas.sistembengkelmotor.entity.Rak;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author teguhsis
 */
public class TabelRakModel extends AbstractTableModel {
    
    private List<Rak> list = new ArrayList<Rak>();

    public void setList(List<Rak> list) {
        this.list = list;
    }
    
    

    @Override
    public int getRowCount() {
         return list.size();
    }

    @Override
    public int getColumnCount() {
         return 2; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0: return list.get(rowIndex).getIdRak();
            case 1: return list.get(rowIndex).getLokasi();
            default: return null;
        }
    }

    public boolean add(Rak e) {
        try {
            return list.add(e); 
        } finally {
            fireTableRowsInserted(getRowCount()-1, getRowCount()-1);
        }
    }

    public Rak get(int i) {
        return list.get(i);
    }

    public Rak set(int index, Rak element) {
         try {
            return list.set(index, element);
        } finally {
            fireTableRowsUpdated(index, index);
        }
    }

    public Rak remove(int index) {
        try {
            return list.remove(index);
        } finally {
            fireTableRowsDeleted(index, index);
        }
    }

    
    
    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "ID Rak";
            case 1: return "Lokasi";
            default:return null;
        }
    }
    
    
    
}