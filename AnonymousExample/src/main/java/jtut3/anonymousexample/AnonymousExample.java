/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.anonymousexample;

/**
 *
 * @author DELL
 */
public class AnonymousExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u = new User("Vakhtang", "Tivadze") {
           public void printUser() {
               System.out.println("First Name: " + fName + "; Last Name: " + lName + ";");
           }
        };
        u.printUser();
    }
    
}
