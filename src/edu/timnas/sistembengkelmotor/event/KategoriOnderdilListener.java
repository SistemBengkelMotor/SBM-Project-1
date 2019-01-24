/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.event;

import edu.timnas.sistembengkelmotor.entity.KategoriOnderdil;
import edu.timnas.sistembengkelmotor.model.KategoriOnderdilModel;

/**
 *
 * @author teguhsis
 */
public interface KategoriOnderdilListener {
    
    public void onChange(KategoriOnderdilModel model);
    public void onInsert(KategoriOnderdil kategoriOnderdil);
    public void onDelete();
    public void onUpdate(KategoriOnderdil kategoriOnderdil);
    
}
