/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.objecthashmapexample;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DELL
 */
public class ObjectHashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> data = new HashMap<String, Integer>();
        
        data.put("Vakhtang", 46);
        data.put("Tamara", 44);
        data.put("Ioseb", 43);
        data.forEach((String k, Integer v) -> System.out.println(k + " = " + v));
        
        System.out.println("----------------");
        data.replace("Tamara", data.get("Tamara") + 4);
        data.forEach((var k, var v) -> System.out.println(k + " = " + v));
        
        System.out.println("-----------------");
        int i = 1;
        for (Map.Entry<String, Integer> d : data.entrySet()) {
            if (i++ == 2) {
                d.setValue(d.getValue() + 5);
                break;
            }
        }
        data.forEach((var k, var v) -> System.out.println(k + " = " + v));
        
    }
    
}
