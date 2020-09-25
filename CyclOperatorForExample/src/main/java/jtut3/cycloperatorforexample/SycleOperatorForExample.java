/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.cycloperatorforexample;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class SycleOperatorForExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strVal = JOptionPane.showInputDialog(null, "Enter a positive decimal number:");
        if (strVal == null) {
            JOptionPane.showMessageDialog(null, "You have not entered anything!");
            System.exit(0);
        } else if (strVal.equals("")) {
            JOptionPane.showMessageDialog(null, "You have entered an empty space!");
            System.exit(0);
        } else if (!strVal.matches("^[+-]?[0-9]*.?[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "You have not entered a number!");
            System.exit(0);
        }
        
        int intVal = 0;
        try {
            intVal = Integer.parseInt(strVal);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "You have not entered an deciimal number!");
            System.exit(0);
        }
        
        int start = 1, sum = 0;
        for (int i = start; i <= intVal; i++) {
            sum += i;
        }
        JOptionPane.showMessageDialog(null, "The sum of numbeers from 0 to " + intVal + " is: " + sum);
        
        
    }
    
}
