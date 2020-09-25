/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.cycloperatorfor;

/**
 *
 * @author DELL
 */
public class CyclOperatorFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, start, end, sum;
        
        start = 0;
        end = 100;
        for (i = start; i < end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        start = 0;
        end = 100;
        for (i = start; i < end; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();
        
        start = 0;
        end = 10;
        sum = 0;
        for (i = start; i <= end; i += 2) {
            sum += i;
        }
        System.out.println("The sum of even numbers from 0 to 10: " + sum);
    }
    
}
