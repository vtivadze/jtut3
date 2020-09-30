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
public class Point extends Shape {
    public Point(int x, int y) {
        super(x, y);
    }
    
    @Override
    public void draw() {
        System.out.println("We are drawing a point with coordinates: (" + x + ", " + y + ");");
    }
}
