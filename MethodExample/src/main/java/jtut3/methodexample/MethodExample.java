/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.methodexample;

/**
 *
 * @author DELL
 */
public class MethodExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u = new User();
        
        u.setId(1);
        u.setLogin("Vakhtang");
        u.setPassword("secret");
        
        System.out.println(u.getUserInfo());
    }
    
}
