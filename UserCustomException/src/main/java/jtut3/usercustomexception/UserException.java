/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.usercustomexception;

/**
 *
 * @author DELL
 */
public class UserException extends Exception {
    final static public int SHORT_LOGIN = 1;
    final static public int LONG_LOGIN = 2;
    private int code;
    static public String[] message = new String[] {
        "Too short login!",
        "Too long login!",
    };
    
    public UserException(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
    
    @Override
    public String toString() {
        return message[code - 1];
    }
}
