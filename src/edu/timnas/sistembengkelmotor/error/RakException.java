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
public class RakException extends Exception {

    /**
     * Creates a new instance of <code>RakException</code> without detail
     * message.
     */
    public RakException() {
    }

    /**
     * Constructs an instance of <code>RakException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public RakException(String msg) {
        super(msg);
    }
}
