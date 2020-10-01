/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.recursionexample;

/**
 *
 * @author DELL
 */
public class RecursionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 90;
        printNumbersTill_100(i);
    }
    
    public static void printNumbersTill_100(int i) {
        System.out.println(i++);
        if (i < 100) {
            printNumbersTill_100(i);
        }
    }
    
}
