/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.event;

import edu.timnas.sistembengkelmotor.entity.Rak;
import edu.timnas.sistembengkelmotor.model.RakModel;

/**
 *
 * @author teguhsis
 */
public interface RakListener {
    public void onChange(RakModel model);
    public void onInsert(Rak rak);
    public void onDelete();
    public void onUpdate(Rak rak);
}
