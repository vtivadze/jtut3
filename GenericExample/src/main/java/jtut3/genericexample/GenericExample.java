/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.genericexample;

/**
 *
 * @author DELL
 */
public class GenericExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer itemIds[] = new Integer[] {1, 2, 3, 4, 5};
        Shop<Integer> sOne = new Shop<Integer>(itemIds);
        sOne.printObject();
        
        String itemNames[] = new String[] {"item_1", "item_2", "item_3"};
        Shop<String> sTwo = new Shop<String>(itemNames);
        sTwo.printObject();
    }
    
}
