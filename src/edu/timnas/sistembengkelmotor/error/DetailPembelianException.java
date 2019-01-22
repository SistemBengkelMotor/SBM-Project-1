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
public class DetailPembelianException extends Exception {

    /**
     * Creates a new instance of <code>DetailPembelianException</code> without
     * detail message.
     */
    public DetailPembelianException() {
    }

    /**
     * Constructs an instance of <code>DetailPembelianException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DetailPembelianException(String msg) {
        super(msg);
    }
}
