/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.exceptionexample;
import javax.swing.JOptionPane;
/**
 *
 * @author DELL
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] iArr = new int[] {1, 2, 3, 4, 5};
        try {
            System.out.println(iArr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
