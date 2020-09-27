/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.createclassexample;

/**
 *
 * @author DELL
 */
public class CreateClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u_1 = new User(1, "Vakhtang", "vTivadze");
        User u_2 = new User(2, "Ioseb", "iTivadze");
        
        User[] u_arr = new User[2];
        u_arr[0] = u_1;
        u_arr[1] = u_2;
        
        for (User u : u_arr) {
            System.out.println("id = " + u.id + "; login = " + u.login + "; password = " + u.password + ";");
        }
    }
    
}
