/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.usercustomexception;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class UserCustomException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String login = JOptionPane.showInputDialog(null, "Enter your login:");
        User user = new User();
        try {
            user.setLogin(login);
            JOptionPane.showMessageDialog(null, "Your login: " + user.getLogin());
        } catch (UserException e) {
            JOptionPane.showMessageDialog(null, UserException.message[e.getCode() - 1]);
            System.out.println(e);
        }
    }
    
}
