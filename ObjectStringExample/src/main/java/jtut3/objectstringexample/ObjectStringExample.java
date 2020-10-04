/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.objectstringexample;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ObjectStringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String s = JOptionPane.showInputDialog(null, "Enter a string:");
            if (s == null) throw new NullStringException();
            if (s.equals("")) throw new EmptyStringException();

            System.out.println(s.toUpperCase());
            System.out.println(s.toLowerCase());
            System.out.println(s.substring(1, 5));
            System.out.println(s.indexOf("hello"));
        } catch (UserException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
        }
    }
    
}
