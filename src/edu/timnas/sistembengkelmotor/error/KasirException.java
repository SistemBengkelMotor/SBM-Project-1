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
public class KasirException extends Exception {

    /**
     * Creates a new instance of <code>KasirException</code> without detail
     * message.
     */
    public KasirException() {
    }

    /**
     * Constructs an instance of <code>KasirException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public KasirException(String msg) {
        super(msg);
    }
}
