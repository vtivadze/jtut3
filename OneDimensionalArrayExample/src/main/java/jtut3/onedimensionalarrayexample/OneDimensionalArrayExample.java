/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.onedimensionalarrayexample;

/**
 *
 * @author DELL
 */
public class OneDimensionalArrayExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] d_arr = new double[5];
        
        for (int i = 0; i < d_arr.length; i++) {
            d_arr[i] = Math.random();
        }
        
        double sum = 0;
        int i = 0;
        while (i < d_arr.length) {
            sum += d_arr[i];
            i++;
        }
        System.out.println("Sum of array elements is: " + sum);
        
        double mult = 1;
        for (double d_el : d_arr) {
            mult *= d_el;
        }
        System.out.println("Multiplication of array elements is: " + mult);
    }
    
}
