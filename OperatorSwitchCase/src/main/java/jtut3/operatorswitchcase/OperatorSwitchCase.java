/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.operatorswitchcase;

/**
 *
 * @author DELL
 */
public class OperatorSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;
        String s;
        while (true) {
            switch (a) {
                case 1:
                    s = "one";
                    break;
                case 2:
                    s = "two";
                    break;
                case 3:
                    s = "three";
                    break;
                default:
                    s = "other number";
            }
            System.out.println(a + " - " + s);
            a++;
            if (a > 4) break;
        }
    }
    
}
