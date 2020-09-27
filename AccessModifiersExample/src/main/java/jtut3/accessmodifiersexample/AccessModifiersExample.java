/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.accessmodifiersexample;

/**
 *
 * @author DELL
 */
public class AccessModifiersExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u = new User(1, "vTivadze", "secret");
        // System.out.println("Id: " + u.id + "; Login: " + u.login + "; Password: " + u.password + ";"); - error
        
        System.out.println(u.getTextInfo());

        u.setLogin("Vakhtang_Tivadze");
        System.out.println("Login: " + u.getLogin());
        
        
    }
    
}
