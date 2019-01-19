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
public class TypeException extends Exception {

    /**
     * Creates a new instance of <code>TypeException</code> without detail
     * message.
     */
    public TypeException() {
    }

    /**
     * Constructs an instance of <code>TypeException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public TypeException(String msg) {
        super(msg);
    }
}
