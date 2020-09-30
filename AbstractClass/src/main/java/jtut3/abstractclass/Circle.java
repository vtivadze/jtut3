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
public class Circle extends Shape {
    public int r;
    
    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }
    
    @Override
    public void draw() {
        String s = "We are drawing a crice with the center in (" + x + ", " + y + ")";
        s += " and the radius " + r + "sm;";
        System.out.println(s);
    }
}
