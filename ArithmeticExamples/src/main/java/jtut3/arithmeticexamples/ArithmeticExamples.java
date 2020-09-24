/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.arithmeticexamples;

/**
 *
 * @author DELL
 */
public class ArithmeticExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double d1 = 2.3;
        double d2 = 3.5;
        
        double sum = d1 + d2;
        System.out.println("Sum: " + sum);
        double sub = d1 - d2;
        System.out.println("Sub: " + sub);
        double mlt = d1 * d2;
        System.out.println("Mlt: " + mlt);
        double div = d1 / d2;
        System.out.println("Div: " + div);
        
        System.out.println("d1: " + d1);
        d1++;
        System.out.println("Incr d1: " + d1);
        
        System.out.println("d2: " + d2);
        d2--;
        System.out.println("Decr d2: " + d2);
        
        d1 = d1 + 5;
        d1 += 5;
        System.out.println("d1: " + d1);
        
        int i = 8;
        int reminder = i % 3;
        System.out.println("Reminder: " + reminder);
    }
    
}
