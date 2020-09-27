 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.accessmodifiers;

/**
 *
 * @author DELL
 */
public class AccessModifiers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.city); // correct becouse of the same package 'accessmodifiers'
        // System.out.println(p.age); - error
        System.out.println(p.getAge());
        
        // p pNew = new Person("Michael", "Sverdlovsk", 25); - error
    }
    
}
