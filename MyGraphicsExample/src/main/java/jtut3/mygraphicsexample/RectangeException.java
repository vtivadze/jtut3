/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.mygraphicsexample;

/**
 *
 * @author DELL
 */
public class RectangeException extends Exception {
    final static public int NO_PARAMETER = 1;
    final static public int EMPTY_PARAMETER = 2;
    public int code;
    static public String[] message = new String[] {
        "There was passed no parameter",
        "There was passed empty parameter",
    };
    
    public RectangeException(int code) {
        this.code = code;
    }
    
    @Override
    public String toString() {
        return message[code - 1];
    }
}
