/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guievent;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class User {
    private String name;
    private String email;
    private boolean news;
    private static ArrayList<User> users = new ArrayList();
    
    public User(String name, String email, boolean news) throws UserException {
        if (name.length() == 0) throw new UserException(UserException.NO_NAME);
        if (email.length() == 0) throw new UserException(UserException.NO_EMAIL);
        this.name = name;
        this.email = email;
        this.news = news;
    }
    
    public static void add(User user) {
        users.add(user);
    }
    
    public static void printAllUsers() {
        users.forEach(u -> System.out.println(u));
    }
    
    public String toString() {
        return "User name: " + name + "; email: " + email + "; news: " + news + ";";
    }
}
