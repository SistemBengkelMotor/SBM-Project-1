/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.event;

import edu.timnas.sistembengkelmotor.entity.Kasir;
import edu.timnas.sistembengkelmotor.model.KasirModel;

/**
 *
 * @author teguhsis
 */
public interface KasirListener {
    public void onChange(KasirModel model);
    public void onInsert(Kasir kasir);
    public void onDelete();
    public void onUpdate(Kasir kasir);
}
