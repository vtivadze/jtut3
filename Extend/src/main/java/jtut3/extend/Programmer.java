/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.extend;

/**
 *
 * @author DELL
 */
public class Programmer extends Person {
    private int exp;
    
    public Programmer(String name, String city, int age, int exp) {
        super(name, city, age);
        this.exp = exp;
    }
    
    public Programmer() {
        super();
        this.exp = 0;
    }
    
    @Override
     public String  getTextInfo() {
         String s = super.getTextInfo();
         s += " Experience: "  + getExp() + " years;";
         return s;
     }
     
     public int getExp() {
         return exp;
     }
}
