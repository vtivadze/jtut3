/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.bitoperatorexamples;

/**
 *
 * @author DELL
 */
public class BitOperatorExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5, b = 10;
        
        String s_a = Integer.toBinaryString(a);
        String s_b = Integer.toBinaryString(b);
        
        System.out.println("Binary of " + a + " is " + s_a);
        System.out.println("Binary of " + b + " is " + s_b);
        
        System.out.println(s_a + " & " + s_b + " = " + Integer.toBinaryString(a & b));
        System.out.println(s_a + " | " + s_b + " = " + Integer.toBinaryString(a | b));
        System.out.println(s_a + " ^ " + s_b + " = " + Integer.toBinaryString(a ^ b));
        
        System.out.println("~" + a + " = " + Integer.toBinaryString(~a));
        System.out.println(a + " >> 1 = " + Integer.toBinaryString(a >> 1));
        System.out.println(a + " << 1 = " + Integer.toBinaryString(a << 1));
        
        
    }
    
}
