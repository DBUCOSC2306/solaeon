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
public class ElementNotFoundException extends RuntimeException {

    /**
     * Creates a new instance of <code>ElementNotFoundException</code> without
     * detail message.
     */
    public ElementNotFoundException() { System.out.println("Meow"); }

    /**
     * Constructs an instance of <code>ElementNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ElementNotFoundException(String msg) {
        super(msg);
    }
}
