/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.anonymous;

/**
 *
 * @author DELL
 */
public class Anonymous {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape p = new Shape(10, 20) {
            public void draw() {
                String s = "We are drawing a pint (" + x + ", " + y + ");";
                System.out.println(s);
            }
        };
        p.draw();
        
        DrawShape ds = new DrawShape() {
           public void draw() {
               System.out.println("Drawing of figures");
           }
        };
        ds.draw();
    }
    
}
