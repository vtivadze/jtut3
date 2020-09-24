/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.logicoperators;

/**
 *
 * @author DELL
 */
public class LogicOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean b_1 = true;
        boolean b_2 = false;
        
        System.out.println(b_1 + " && " + b_2 + " = " + (b_1 && b_2));
        System.out.println(b_1 + " || " + b_2 + " = " + (b_1 || b_2));
        System.out.println("! " + b_1 + " = " + (!b_1));
        System.out.println("! " + b_2 + " = " + (!b_2));
        System.out.println(b_1 + " ^ " + b_2 + " = " + (b_1 ^ b_2));
    }
    
}
