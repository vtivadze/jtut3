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
public class Person {
    public String name;
    protected String city;
    private int age;
    
    private Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }
    
    public Person() {
        this("Default name", "Default city", 18);
    }
    
    public String getName() {
        return name;
    }
    
    public String getCity() {
        return city;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setName() {
        setName("Default name");
    }
    
    public void setCity() {
        setCity("Default city");
    }
    
    public void setAge() {
        setAge(18);
    }
    
    public String getTextInfo() {
        return "Name: " + getName() + "; City: " + getCity() + "; Age: " + getAge() + ";";
    }
}
