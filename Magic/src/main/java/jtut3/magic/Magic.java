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
public class Magic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println(p);
        
        String s = "Our object is " + p;
        System.out.println(s);
        
        Point pNew = p;
        System.out.println(pNew);
        p.x = 30;
        System.out.println(pNew);
        
        pNew = p.clone();
        p.x = 50;
        System.out.println(pNew);
        
        pNew.y = 40;
        System.out.println(pNew);
        System.out.println(p);
    }
    
}
