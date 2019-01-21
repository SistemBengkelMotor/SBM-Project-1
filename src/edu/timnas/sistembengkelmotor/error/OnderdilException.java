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
public class OnderdilException extends Exception {

    /**
     * Creates a new instance of <code>OnderdilException</code> without detail
     * message.
     */
    public OnderdilException() {
    }

    /**
     * Constructs an instance of <code>OnderdilException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public OnderdilException(String msg) {
        super(msg);
    }
}
