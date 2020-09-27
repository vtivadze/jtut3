/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.extend;

/**
 *
 * @author DELL
 */
public class Extend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programmer pVaxo = new Programmer("Vakhtang", "Tbilisi", 46, 10);
        System.out.println(pVaxo.getTextInfo());

        Worker w = new Worker();
        w.setSalary(20000);
        System.out.println(w.getTextInfo());
        
        System.out.println(new Worker().getTextInfo());
        
        Person pIgor = new Programmer("Igor", "Moscow", 35, 15); // polimorfizm
        System.out.println(pIgor.getTextInfo());
    }
    
}
