/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.usercustomexceptionexample;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class UserCustomExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String n_1 = JOptionPane.showInputDialog(null, "Enter a positive number 1:");
            String n_2 = JOptionPane.showInputDialog(null, "Enter a positive number 2:");
            if (n_1 == null || n_2 == null) throw new NullException();
            if (n_1.length() == 0 || n_2.equals("")) throw new NoNumberException();
            
            int a = Integer.parseInt(n_1);
            int b = Integer.parseInt(n_2);
            if (a <= 0 || b <= 0) throw new NegativeNumberException();
            if (a >= 100 || b >= 100) throw new TooBigNumberException();
            
            JOptionPane.showMessageDialog(null, "Sum of numbers " + a + " and " + b + " is " + (a + b) + ";");
        } catch (NumberFormatException | UserException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            System.exit(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unknown exception!");
            System.out.println(e);
            System.exit(0);
        }
    }
    
}
