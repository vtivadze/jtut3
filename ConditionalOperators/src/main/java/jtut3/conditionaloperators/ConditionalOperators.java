/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.conditionaloperators;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ConditionalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 7, b = 9;
        
        if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a > b");
        }
        
        String str = a < b ? "a < b" : "a >= b";
        System.out.println(str);
        
        System.out.println(a < b ? "a < b" : "a >= b");
        
        int age = 25;
        if (age > 18) System.out.println("The person is adult");
        
        String in;
        in = JOptionPane.showInputDialog(null, "Enter a number", JOptionPane.QUESTION_MESSAGE);
        if (in != null && !in.equals("")) {
            Double n = Double.parseDouble(in);
            if (n > 0) {
                System.out.println("You've entered a positive number");
            } else if (n == 0) {
                System.out.println("You've entered the zero");
            } else {
                System.out.println("You've entered a negative number");
            }
        } else {
            System.out.println("You haven't entered a number");
        }
    }
    
}
