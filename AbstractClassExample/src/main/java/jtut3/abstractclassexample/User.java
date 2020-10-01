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
abstract public class User {
    public String fName;
    public String lName;
    
    public User(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }
    
    abstract public void printUser();
}
