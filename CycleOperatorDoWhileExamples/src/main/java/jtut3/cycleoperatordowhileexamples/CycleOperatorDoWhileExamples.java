/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.cycleoperatordowhileexamples;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class CycleOperatorDoWhileExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inStr = "";
        int inInt = 0;

        do {
            inStr = JOptionPane.showInputDialog(null, "Enter a positive decimal number!", "User input", JOptionPane.QUESTION_MESSAGE);
            
            if (inStr == null) {
                JOptionPane.showMessageDialog(null, "You have not entered anything!", "Result", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            
            if (inStr.equals("")) {
                JOptionPane.showMessageDialog(null, "You have entered an empty space!", "Result", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            
            try {
                inInt = Integer.parseInt(inStr);
            } catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "You have not entered a decimal number!", "Result", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            
            if (inInt <= 0) {
                JOptionPane.showMessageDialog(null, "You have not entered a positive number!", "Result", JOptionPane.ERROR_MESSAGE);
                continue;
            }
            
            break;
        } while (true);
        
        System.out.println("You have entered: " + inInt);
    }
    
}
