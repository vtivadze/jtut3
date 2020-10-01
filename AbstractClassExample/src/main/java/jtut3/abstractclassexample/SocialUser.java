/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.abstractclassexample;

/**
 *
 * @author DELL
 */
public class SocialUser extends User{
    public int age;
    
    public SocialUser(String fName, String lName, int age) {
        super(fName, lName);
        this.age = age;
    }
    
    @Override
    public void printUser() {
        String s = "Social user -";
        s += " First name: " + fName + ";";
        s += " Last name: " + lName + ";";
        s += " Age: " + age + ";";
        System.out.println(s);
    }
}
