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
public class Firm {
    public String nameFirm;
    public Director director;
    
    public Firm(String nameFirm, String nameDirector, int age) {
        this.nameFirm = nameFirm;
        this.director = new Director(nameDirector, age);
    }
    
    class Director {
        public String name;
        public int age;
        
        public Director(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("Created director in firm " + nameFirm);
        }
        
        public boolean isRetiree() {
            return age >= 60;
        }
    }
}
