/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.usercustomexceptionexample;

/**
 *
 * @author DELL
 */
public class TooBigNumberException extends UserException {
    @Override
    public String toString() {
        return "You have entered too big number!";
    }
}
