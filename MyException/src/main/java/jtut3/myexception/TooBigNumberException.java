/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.myexception;

/**
 *
 * @author DELL
 */
public class TooBigNumberException extends Exception {
    @Override
    public String toString() {
        return "Too big number exception";
    }
}
