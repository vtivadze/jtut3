/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.extendexample;

/**
 *
 * @author DELL
 */
public class User {
    private int id;
    private String login;
    private String password;
    
    static private int count = 0;
    
    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
        count++;
    }
    
    public User() {
        this(0, "guest", "");
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

    public int getCount() {
        return count;
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
    
    public String getTextInfo() {
        return "Id: " + getId() + "; Login: " + getLogin() + "; Password: " + getPassword() + ";";
    }
}
