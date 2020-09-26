/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.multidimensionalarrays;

/**
 *
 * @author DELL
 */
public class MultiDimensionalArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[][] arr = new char[2][2];
        
        arr[0][0] = 'a';
        arr[0][1] = 'b';
        arr[1][0] = 'c';
        arr[1][1] = 'd';
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
            }
        }
        
        int[][] table = new int[9][9];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        
        System.out.println("   1   2   3   4   5   6   7   8   9");
        for (int i = 0; i < table.length; i++) {
            System.out.print( (i + 1));
            for (int j = 0; j < table[i].length; j++) {
                System.out.printf("%3d ", table[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
