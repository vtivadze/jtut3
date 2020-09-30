/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.interfaces;

/**
 *
 * @author DELL
 */
public interface DrawShape {
    public void draw();
    
    default void hello() {
        System.out.println("Hello World!");
    }
}
