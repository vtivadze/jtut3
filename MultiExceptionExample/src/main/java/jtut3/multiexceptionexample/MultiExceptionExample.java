/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.multiexceptionexample;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class MultiExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        
        String s = JOptionPane.showInputDialog(null, "Specify index:");
        try {
            int i = Integer.parseInt(s);
            if (i < 0) throw new Exception();
            JOptionPane.showMessageDialog(null, "The element with index " + i + " is " + arr[i] + ";");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You have not entered a number!");
            System.out.println(e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "You have entered a negative number!");
            System.out.println(e);
        } finally {
            System.out.println("The program is ending!");
        }
    }
    
}
