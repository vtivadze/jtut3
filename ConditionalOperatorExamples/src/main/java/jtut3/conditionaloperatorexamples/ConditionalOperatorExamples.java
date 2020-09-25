/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.conditionaloperatorexamples;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ConditionalOperatorExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inFirst = JOptionPane.showInputDialog(null, "Enter a positive number:");
        if (inFirst == null) {
            JOptionPane.showMessageDialog(null, "You haven't entered anything! (1)");
            System.exit(0);
        } else if (inFirst.equals("")) {
            JOptionPane.showMessageDialog(null, "You've enterd an empty space! (1)");
            System.exit(0);
        }
        
        String inSecond = JOptionPane.showInputDialog(null, "Enter a non zero number:");
        if (inSecond == null) {
            JOptionPane.showMessageDialog(null, "You haven't entered anything! (2)");
            System.exit(0);
        } else if (inSecond.equals("")) {
            JOptionPane.showMessageDialog(null, "You've entered an empty space! (2)");
            System.exit(0);
        }

        double dFirst = 0, dSecond = 0;
        try {
            dFirst = Double.parseDouble(inFirst);
            dSecond = Double.parseDouble(inSecond);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "You've entered something not a number! (2)");
            System.exit(0);
        }
        
        if (dSecond == 0) {
            JOptionPane.showMessageDialog(null, "Result: infinity");
            System.exit(0);
        }

        double result = dFirst / dSecond;
        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
    
}
