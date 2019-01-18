/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.timnas.sistembengkelmotor.error;

/**
 *
 * @author teguhsis
 */
public class MekanikException extends Exception {

    /**
     * Creates a new instance of <code>MekanikException</code> without detail
     * message.
     */
    public MekanikException() {
    }

    /**
     * Constructs an instance of <code>MekanikException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MekanikException(String msg) {
        super(msg);
    }
}
