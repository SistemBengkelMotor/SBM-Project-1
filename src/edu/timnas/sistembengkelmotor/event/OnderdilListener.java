/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.event;

import edu.timnas.sistembengkelmotor.entity.Onderdil;
import edu.timnas.sistembengkelmotor.model.OnderdilModel;

/**
 *
 * @author teguhsis
 */
public interface OnderdilListener {
    public void onChange(OnderdilModel model);
    public void onInsert(Onderdil onderdil);
    public void onDelete();
    public void onUpdate(Onderdil onderdil);
}
