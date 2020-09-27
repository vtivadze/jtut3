/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.staticfieldsandmethodsexample;

/**
 *
 * @author DELL
 */
public class StaticFieldsAndMethodsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2,  b = 5;
        
        System.out.println("MyMath class methods calling count: " + MyMath.getCount());
        
        System.out.println(a + " + " + b + " = " + MyMath.add(a, b));
        System.out.println(a + " - " + b + " = " + MyMath.sub(a, b));
        System.out.println(a + " * " + b + " = " + MyMath.mult(a, b));
        System.out.println(a + " / " + b + " = " + MyMath.div(a, b));
        
        System.out.println("MyMath class methods calling count: " + MyMath.getCount());
    }
    
}
