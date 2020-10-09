/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.guievent;

/**
 *
 * @author DELL
 */
public class UserException extends Exception {
    final static public int NO_NAME = 1;
    final static public int NO_EMAIL = 2;
    final static public String NO_NAME_ERROR = "You have not entered the name!";
    final static public String NO_EMAIL_ERROR = "You have not entered the email!";
    private int code;
    
    public UserException(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
}
