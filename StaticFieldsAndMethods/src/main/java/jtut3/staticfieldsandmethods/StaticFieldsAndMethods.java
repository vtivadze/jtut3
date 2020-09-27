/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
    package jtut3.staticfieldsandmethods;

/**
 *
 * @author DELL
 */
public class StaticFieldsAndMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Person();
        System.out.println("Count of created persons: " + Person.count);
        
        new Person();
        System.out.println("Count of created persons: " + Person.count);
        
        new Person();
        System.out.println("Count of created persons: " + Person.getCount());
        
        Person p = new Person();
        System.out.println("Count of created persons: " + p.getCount()); // not recomended
    }
    
}
