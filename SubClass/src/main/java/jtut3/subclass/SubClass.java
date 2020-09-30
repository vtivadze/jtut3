/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.subclass;

/**
 *
 * @author DELL
 */
public class SubClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Firm f = new Firm("My Firm", "Igor", 30);
        System.out.println(f.director.name);
        System.out.println("Director is retireed: " + f.director.isRetiree());
        f.director.age = 65;
        System.out.println("Is director retireed? " + f.director.isRetiree());
    }
    
}
