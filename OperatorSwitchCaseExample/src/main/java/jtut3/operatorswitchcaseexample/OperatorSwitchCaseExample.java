/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.operatorswitchcaseexample;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class OperatorSwitchCaseExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inStr_1 = JOptionPane.showInputDialog(null, "Eneter any decimal number:", "User Input Dialog", JOptionPane.QUESTION_MESSAGE);
        int inInt_1 = 0;
        if (inStr_1 == null) {
            JOptionPane.showMessageDialog(null, "You have not entered anything!", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (inStr_1.equals("")) {
            JOptionPane.showMessageDialog(null, "You have entered an empty space!", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        try {
            inInt_1 = Integer.parseInt(inStr_1);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "You have not entered a decimal number!", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        String inStr_2 = JOptionPane.showInputDialog(null, "Eneter any decimal number:", "User Input Dialog", JOptionPane.QUESTION_MESSAGE);
        int inInt_2 = 0;
        if (inStr_2 == null) {
            JOptionPane.showMessageDialog(null, "You have not entered anything!", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (inStr_2.equals("")) {
            JOptionPane.showMessageDialog(null, "You have entered an empty space!", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        try {
            inInt_2 = Integer.parseInt(inStr_2);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "You have not entered a decimal number!", "Result", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        
        String op = JOptionPane.showInputDialog(null, "Enter one operator from '+', '-', '*', '/':", "User Input Dialog", JOptionPane.QUESTION_MESSAGE);
        int result = 0;
        double div = 0;
        switch (op) {
            case "+":
                result = inInt_1 + inInt_2;
                break;
            case "-":
                result = inInt_1 - inInt_2;
                break;
            case "*":
                result = inInt_1 * inInt_2;
                break;
            case "/":
                if (inInt_2 == 0) {
                    JOptionPane.showMessageDialog(null, inInt_1 + " / " + inInt_2 + " = infinite", "Result", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                }
                div = inInt_1 / inInt_2;
                JOptionPane.showMessageDialog(null, inInt_1 + " / " + inInt_2 + " = " + div, "Result", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "You have not entered a correct operation!", "Result", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }
        JOptionPane.showMessageDialog(null, inInt_1 + " " + op + " " + inInt_2 + " = " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
