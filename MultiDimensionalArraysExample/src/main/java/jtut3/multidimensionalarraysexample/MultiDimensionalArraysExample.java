/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.multidimensionalarraysexample;

/**
 *
 * @author DELL
 */
public class MultiDimensionalArraysExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
                System.out.println(arr[i][j]);
            }
        }
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("A sum of array elements: " + sum);
        
        int[] arr_row_sums = new int[2];
        int row_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                row_sum += arr[i][j];
            }
            arr_row_sums[i] = row_sum;
            row_sum = 0;
        }
        
        for (int i = 0; i < arr_row_sums.length; i++) {
            System.out.println(arr_row_sums[i]);
        }
    }
    
}
