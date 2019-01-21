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
public class SupplierException extends Exception {

    /**
     * Creates a new instance of <code>SupplierException</code> without detail
     * message.
     */
    public SupplierException() {
    }

    /**
     * Constructs an instance of <code>SupplierException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public SupplierException(String msg) {
        super(msg);
    }
}
