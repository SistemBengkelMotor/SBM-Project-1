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
public class PembelianException extends Exception {

    /**
     * Creates a new instance of <code>PembelianException</code> without detail
     * message.
     */
    public PembelianException() {
    }

    /**
     * Constructs an instance of <code>PembelianException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PembelianException(String msg) {
        super(msg);
    }
}
