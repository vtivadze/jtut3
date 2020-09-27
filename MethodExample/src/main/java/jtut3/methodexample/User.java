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
public class User {
    int id;
    String login;
    String password;
    
    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }
    
    public User() {
        id = 0;
        login = "guest";
        password = "";
    }
    
    public int getId() {
        return id;
    }
    
    public String getLogin() {
        return login;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setId() {
        setId(0);
    }
    
    public void setLogin() {
        setLogin("guest");
    }
    
    public void setpassword() {
        setPassword("");
    }
    
    public String getUserInfo() {
        return "id: " + id + "; login: " + login + "; password: " + password + ";";
    }
}
