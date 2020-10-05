/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.objectarraylistexample;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ObjectArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> login = new ArrayList<String>();
        
        login.add("vaxo");
        login.add("soso");
        login.add("tazo");
        for (String value : login) {
            System.out.print(value + " ");
        }
        
        System.out.println();
        System.out.println("---------------------");
        
        login.set(1, "ioseb");
        login.forEach((value) -> System.out.print(value + " "));
        System.out.println();
        
    }
    
}
