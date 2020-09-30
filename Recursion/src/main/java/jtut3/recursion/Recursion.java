/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.recursion;

/**
 *
 * @author DELL
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5;
        int f = factorial(x);
        System.out.println("Factorial of " + x + " is: " + f);
    }
    
    public static int factorial(int x) {
        return x == 1 ? 1 : x * factorial(x - 1);
    }
    
}

