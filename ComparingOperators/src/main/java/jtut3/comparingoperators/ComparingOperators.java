/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.comparingoperators;

/**
 *
 * @author DELL
 */
public class ComparingOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 7, b = 8, c = 7;
        
        System.out.println(a + " < " + b + " = " + (a < b));
        System.out.println(a + " > " + b + " = " + (a > b));
        System.out.println(a + " <= " + b + " = " + (a <= b));
        System.out.println(a + " == " + c + " = " + (a == c));
        System.out.println(a + " != " + c + " = " + (a != c));
    }
    
}
