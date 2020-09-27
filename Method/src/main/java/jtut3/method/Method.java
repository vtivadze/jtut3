/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.method;

/**
 *
 * @author DELL
 */
public class Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = new Person("Igor", "Omsk", 20);
        System.out.println(p.getTextInfo());
        
        p.setName("Oleg");
        p.setCity("Krasnodar");
        p.setAge(25);
        System.out.println(p.getName());
        System.out.println(p.getCity());
        System.out.println(p.getAge());
        
        Person pNew = new Person("Vakhtang", "Tbilis", 25);
        p.whoIsOlder(pNew);
        
        pNew.setAge(30);
        p.whoIsOlder(pNew);
        
        pNew.setAge(15);
        p.whoIsOlder(pNew);
        
        Person pAnother = new Person();
        System.out.println(pAnother.getTextInfo());
        
        pNew.setName();
        pNew.setCity();
        pNew.setAge();
        System.out.println(pNew.getTextInfo());
    }
    
}
