/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.userexception;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class UserException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n_1 = JOptionPane.showInputDialog(null, "Enter a positive number 1:");
        String n_2 = JOptionPane.showInputDialog(null, "Enter a positive number 2:");
        
        try {
            int a = Integer.parseInt(n_1);
            int b = Integer.parseInt(n_2);
            if (a <= 0 || b <= 0) throw new Exception();
            JOptionPane.showMessageDialog(null, "Sum of numbers: " + (a + b));
        } catch (Exception e) {
            System.out.println("Incorrect data");
        } finally {
            System.out.println("Program in ending!");
        }
    }
    
}
