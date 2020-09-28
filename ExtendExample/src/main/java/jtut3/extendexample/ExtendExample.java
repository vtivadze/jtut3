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
public class ExtendExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserSocial us = new UserSocial(1, "iTivadze", "iSecret", "Ioseb Tivadze", 47);
        WebMaster wm = new WebMaster(2, "vTivadze", "vSecret", "https://sitemaker.ge");
        
        System.out.println(us.getTextInfo());
        System.out.println(wm.getTextInfo());
    }
    
}
