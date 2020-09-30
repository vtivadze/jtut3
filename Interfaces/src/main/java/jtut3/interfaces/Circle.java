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
public class Circle extends Shape {
    public int r;
    
    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
    
    @Override
    public void draw() {
        System.out.println("We are drawing a circle with the center in (" + x + ", " + y + ") and the radius " + r + "sm;");
    }
}
