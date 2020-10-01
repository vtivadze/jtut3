/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.lambdaexample;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author DELL
 */
public class LambdaExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer arr[] = new Integer[] {1, 47, 35, 14, 68, 8, 90, 57, 9, 39, 54};
        Arrays.sort(arr, (a, b) -> Integer.compare(a, b));
        
        List<Integer> arrL = Arrays.asList(arr);
        arrL.forEach((item) -> System.out.println(item));
    }
    
}
