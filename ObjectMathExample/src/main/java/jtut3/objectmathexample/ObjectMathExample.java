/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.objectmathexample;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ObjectMathExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sRadius = JOptionPane.showInputDialog(null, "Enter circle radius:");
        int iRadius = Integer.parseInt(sRadius);
        System.out.println("Circle radius: " + iRadius + ";");
        System.out.println("Circle area: " + (Math.PI * Math.pow(iRadius, 2)) + ";");
        
        double sum = 9895;
        double perc = 5.7;
        double inc = sum * perc / 100;
        inc = Math.round(inc * 100) / 100;
        System.out.println(inc);
    }
    
}
