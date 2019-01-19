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
public class MerkException extends Exception {

    /**
     * Creates a new instance of <code>MerkException</code> without detail
     * message.
     */
    public MerkException() {
    }

    /**
     * Constructs an instance of <code>MerkException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MerkException(String msg) {
        super(msg);
    }
}
