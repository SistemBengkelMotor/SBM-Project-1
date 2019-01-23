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
public class DetailServiceException extends Exception {

    /**
     * Creates a new instance of <code>DetailServiceException</code> without
     * detail message.
     */
    public DetailServiceException() {
    }

    /**
     * Constructs an instance of <code>DetailServiceException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DetailServiceException(String msg) {
        super(msg);
    }
}
