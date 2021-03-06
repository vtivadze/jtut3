/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.myexception;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MyException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n_1 = JOptionPane.showInputDialog(null, "Enter a positive number 1:");
        String n_2 = JOptionPane.showInputDialog(null, "Enter a positive number 2:");
        try {
            int a = Integer.parseInt(n_1);
            int b = Integer.parseInt(n_2);
            if (a <= 0 || b <= 0) throw new NegativeNumberException();
            if (a > 100 || b > 100) throw new TooBigNumberException();
            JOptionPane.showMessageDialog(null, "Sum of numbers: " + (a + b));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You have not entered a number!");
            System.out.println(e);
        } catch (NegativeNumberException e) {
            JOptionPane.showMessageDialog(null, "You have entered a negative number!");
            System.out.println(e);
        } catch (TooBigNumberException e) {
            JOptionPane.showMessageDialog(null, "You have entered too big number!");
            System.out.println(e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Unknown exception!");
            System.out.println(e);
        } finally {
            System.out.println("The program in ending!");
        }
    }
    
}
