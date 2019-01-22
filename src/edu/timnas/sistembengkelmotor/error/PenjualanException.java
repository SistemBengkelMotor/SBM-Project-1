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
public class PenjualanException extends Exception {

    /**
     * Creates a new instance of <code>PejualanException</code> without detail
     * message.
     */
    public PenjualanException() {
    }

    /**
     * Constructs an instance of <code>PejualanException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PenjualanException(String msg) {
        super(msg);
    }
}
