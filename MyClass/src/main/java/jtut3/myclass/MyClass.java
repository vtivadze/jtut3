/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.myclass;

/**
 *
 * @author DELL
 */
public class MyClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Michel", "Moscow", 30);
        System.out.println(p.name);
        System.out.println(p.city);
        System.out.println(p.age);
        
        Person[] p_arr = new Person[3];
        p_arr[0] = new Person("Igor", "Omsk", 35);
        p_arr[1] = new Person("Jack", "Krasnodar", 15);
        p_arr[2] = new Person("Oleg", "Vladivastok", 18);
        for (int i = 0; i < p_arr.length; i++) {
            System.out.println(p_arr[i].name + " " + p_arr[i].city + p_arr[i].age);
            p_arr[i].age = 15;
        }
        for (Person p_i : p_arr) {
            System.out.println(p_i.name + " " + p_i.city + " " + p_i.age);
        }
    }
    
}
