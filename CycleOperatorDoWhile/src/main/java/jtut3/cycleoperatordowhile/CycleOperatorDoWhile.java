/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.cycleoperatordowhile;

/**
 *
 * @author DELL
 */
public class CycleOperatorDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        while (a > 10) {
            System.out.println("We are in the cicle while");
        }
        
        do {
            System.out.println("We are in the cicle do-while");
        } while (a > 10);
        
        a = 0;
        while (true) {
            a++;
            if (a == 10) break;
            if (a % 2 == 0) continue;
            System.out.println(a);
        }
    }
    
}
