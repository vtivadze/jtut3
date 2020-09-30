/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.magic;

/**
 *
 * @author DELL
 */
public class Point implements Cloneable {
    public int x;
    public int y;
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString() {
        return "The point with coordinates (" + x + ", " + y + ");";
    }
    
    @Override
    public Point clone() {
        return new Point(x, y);
    }
}
