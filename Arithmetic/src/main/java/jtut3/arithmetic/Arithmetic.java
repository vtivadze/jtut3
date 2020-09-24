/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.arithmetic;

/**
 *
 * @author DELL
 */
public class Arithmetic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = a + b;
        System.out.println("Sum: " + result);
        
        result = a - b;
        System.out.println("Substraction: " + result);
        
        result = a * b;
        System.out.println("Multiplication: " + result);
        
        result = a / b;
        System.out.println("Dividion: " + result);
        double d = (double) a / b;
        System.out.println("Dividion: " + d);
        
        result = 7 % 3;
        System.out.println("Reminder: " + result);
        
        a++;
        System.out.println("Increment: " + a);
        b--;
        System.out.println("Decrement: " + b);
        
        a += b;
        System.out.println("a: " + a);
    }
    
    
}
