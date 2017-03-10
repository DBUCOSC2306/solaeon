/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsjf.exceptions;

/**
 *
 * @author ryxun
 */
public class NonComparableElementException extends RuntimeException {

    /**
     * Creates a new instance of <code>NonComparableElementException</code>
     * without detail message.
     */
    public NonComparableElementException() {
    }

    /**
     * Constructs an instance of <code>NonComparableElementException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public NonComparableElementException(String msg) {
        super(msg);
    }
}
