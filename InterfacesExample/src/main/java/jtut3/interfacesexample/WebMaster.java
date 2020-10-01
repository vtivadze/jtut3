/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.interfacesexample;

/**
 *
 * @author DELL
 */
public class WebMaster extends User {
    public String site;
    
    public WebMaster(String fName, String lName, String site) {
        super(fName, lName);
        this.site = site;
    }
    
    @Override
    public void printUser() {
        String s = "Web master -";
        s += " First name: " + fName + ";";
        s += " Last name: " + lName + ";";
        s += " Site: " + site + ";";
        System.out.println(s);
    }
}
