/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.myline;

/**
 *
 * @author DELL
 */
public class MyLine {
    public MyPoint pStart;
    public MyPoint pEnd;
    
    public MyLine(int xStart, int yStart, int xEnd, int yEnd) {
        pStart = new MyPoint(xStart, yStart);
        pEnd = new MyPoint(xEnd, yEnd);
    }
    
    public class MyPoint {
        public int x;
        public int y;
        
        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyLine ml = new MyLine(5, 7, 10, 3);
        String s = "Starting point";
        s += " (" + ml.pStart.x + ", " + ml.pStart.y + ");";
        s += " End point (" + ml.pEnd.x + ", " + ml.pEnd.y + ");";
        System.out.println(s);
    }
    
}
