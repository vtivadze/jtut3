/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.extendexample;

/**
 *
 * @author DELL
 */
public class UserSocial extends User {
    private String name;
    private int age;
    
    public UserSocial(int id, String login, String password, String name, int age) {
        super(id, login, password);
        this.name = name;
        this.age = age;
    }
    
    public UserSocial() {
        super();
        name = "Default name";
        age = 18;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String getTextInfo() {
        String s = super.getTextInfo();
        s += " Name: " + getName() + "; Age: " + getAge() + ";";
        return s;
    }
}
