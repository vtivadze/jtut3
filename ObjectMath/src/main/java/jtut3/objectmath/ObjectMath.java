/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.objectmath;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author DELL
 */
public class ObjectMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Math.E);
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.cos(1));
        System.out.println(Math.sin(1));
        System.out.println(Math.sin(30 * Math.PI / 180));
        System.out.println(Math.tan(1));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.pow(5, 3));
        
        System.out.println(Math.round(5.7));
        System.out.println((double)(Math.round(5.7689 * 100)) / 100);
        System.out.println(Math.ceil(5.7));
        System.out.println(Math.floor(5.7));
        BigDecimal bd = new BigDecimal(5.87858);
        System.out.println(bd.setScale(3, RoundingMode.HALF_UP));
        System.out.println((new BigDecimal(5.87858)).setScale(3, RoundingMode.HALF_UP));
        
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 11)); // random in 0 - 10
        System.out.println((int) (1 + Math.random() * 10)); // random in 1 - 10
    }
    
}
