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
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        
        shapes[0] = new Circle(5, 7, 8);
        shapes[1] = new Circle(9, 10, 11);
        shapes[2] = new Point(12, 13);
        
        for (Shape s : shapes) {
            s.draw();
            s.hello();
        }
    }
    
}
