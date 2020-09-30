/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.generic;

/**
 *
 * @author DELL
 */
public class Generic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Test<Integer, String> t = new Test<Integer, String>(10, "Hello");
         t.print();
         
         t.setDataX(15);
         t.setDataY("World!");
         
         System.out.println(t.getDataX());
         System.out.println(t.getDataY());
         
         Test t1 = new Test(true, false);
         t1.print();
         t1.setDataY(5);
         t1.print();
    }
    
}
