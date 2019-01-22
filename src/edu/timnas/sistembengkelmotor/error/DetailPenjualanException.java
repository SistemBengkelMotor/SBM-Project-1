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
public class DetailPenjualanException extends Exception {

    /**
     * Creates a new instance of <code>DetailPenjualanException</code> without
     * detail message.
     */
    public DetailPenjualanException() {
    }

    /**
     * Constructs an instance of <code>DetailPenjualanException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DetailPenjualanException(String msg) {
        super(msg);
    }
}
