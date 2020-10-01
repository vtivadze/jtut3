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
public class AbstractClassExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User[] users = new User[2];
        users[0] = new WebMaster("Vakhtang", "Tivadze", "https://sitemaker.ge");
        users[1] = new SocialUser("Ioseb", "Tivadze", 47);
        
        for (User u : users) {
            u.printUser();
        }
    }
    
}
