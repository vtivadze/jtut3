/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.logicoperatorexamples;

/**
 *
 * @author DELL
 */
public class LogicOperatorExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean b_1 = true, b_2 = false, b_3 = false;
        
        System.out.println(b_1 + " && !" + b_2 + " && !" + b_3 + " = " + (b_1 && !b_2 && !b_3));
        System.out.println("!" + b_1 + " || " + b_2 + " || " + b_3 + " = " + (!b_1 || b_2 || b_3));
        System.out.println(b_1 + " ^ " + b_2 + " ^ " + b_3 + " = " + (b_1 ^ b_2 ^ b_3));
        
    }
    
}
