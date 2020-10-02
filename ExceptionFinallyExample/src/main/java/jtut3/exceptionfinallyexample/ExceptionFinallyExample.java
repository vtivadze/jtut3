/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.exceptionfinallyexample;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ExceptionFinallyExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog(null, "Enter a number");
        try {
            int n = Integer.parseInt(s);
            JOptionPane.showMessageDialog(null, "You have entered a number: " + n);
        } catch (NumberFormatException e) {
            System.out.println("You have not entered a number with correct format!");
        } finally {
            System.out.println("Program in ending!");
        }
    }
    
}
