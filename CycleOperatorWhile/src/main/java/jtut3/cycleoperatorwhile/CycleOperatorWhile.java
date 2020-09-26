/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.cycleoperatorwhile;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class CycleOperatorWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String inStr = JOptionPane.showInputDialog(null, "Enter a positive decimal number:", "User input dialog", JOptionPane.QUESTION_MESSAGE);
        if (inStr == null) {
            JOptionPane.showMessageDialog(null, "You have not entered anything!", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else if (inStr.equals("")) {
            JOptionPane.showMessageDialog(null, "You have entered an empty space!", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        int inInt = 0;
        try {
            inInt = Integer.parseInt(inStr);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "You have not entered a decimal number!", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        if (inInt <= 0) {
            JOptionPane.showMessageDialog(null, "You have not entered a positive decimal number!", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        int i = 0, sum = 0;
        while (i < inInt) {
            sum += i;
            i++;
        }
        System.out.println("The sum of numbers from 0 to " + inInt + " is: " + sum);
    }
    
}
