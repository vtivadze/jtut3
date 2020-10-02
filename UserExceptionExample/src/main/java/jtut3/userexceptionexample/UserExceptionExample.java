/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.userexceptionexample;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class UserExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String s = JOptionPane.showInputDialog(null, "Enter a number:");
            if (s == null || s == "") {
                throw new Exception();
            }
            int n = Integer.parseInt(s);
            JOptionPane.showMessageDialog(null, "Thank you!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You have not entered a number with correct format!");
        }
    }
    
}
