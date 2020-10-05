/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.objectarraylist;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class ObjectArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 11);
            arr.add(n); // add
        }
        
        System.out.println("The third element of arr is: " + arr.get(3)); // get
        
        System.out.println("----------");
        for (int v : arr) { // loop 1
            System.out.print(v);
        }
        System.out.println();
        
        System.out.println("--------------");
        for (int i = 0; i < arr.size(); i++) { // loop 2
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        
        System.out.println("---------------");
        System.out.println("Contains 5: " + arr.contains(5)); // contains
        
        System.out.println("---------------");
        System.out.println("Element of index 5: " + arr.indexOf(5)); // get by index
        
        System.out.println("-----------------");
        System.out.println("Array size: " + arr.size()); // get size
        
        System.out.println("----------------");
        System.out.println("Remove second element: " + arr.remove(2)); // remove by index
        arr.forEach((i) -> System.out.print(i + " ")); // loop 3
        System.out.println();
        
        System.out.println("----------------");
        System.out.println("Remove element with value 5: " + arr.remove(new Integer(5))); // remove by value
        arr.forEach((i) -> System.out.print(i + " "));
        System.out.println();
        
        System.out.println("------------------");
        arr.set(1, 5); // set by index - replace
        arr.forEach((i) -> System.out.print(i + " "));
        System.out.println();
        
        System.out.println("-----------------");
        arr.sort(new Comparator<Integer>() { // compare
            @Override
            public int compare(Integer t, Integer t1) {
                return t - t1;
            }
        });
        arr.forEach((i) -> System.out.print(i + " "));
        System.out.println();
    }
        
}
