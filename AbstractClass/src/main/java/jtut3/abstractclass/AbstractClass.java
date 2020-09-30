/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.abstractclass;

/**
 *
 * @author DELL
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p = new Point(10, 25);
        p.draw();
        
        Circle c = new Circle(5, 10, 25);
        c.draw();
        
        // Shape s = new Shape(5, 5); - Error
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5, 7, 10);
        shapes[1] = new Circle(7, 8, 15);
        shapes[2] = new Point(15, 17);
        
        for (Shape s : shapes) {
            s.draw();
        }
    }
    
}
