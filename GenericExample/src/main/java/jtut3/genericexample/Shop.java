/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.genericexample;

/**
 *
 * @author DELL
 */
public class Shop<X> {
    public X[] xArr;
    
    public Shop(X[] xArr) {
        this.xArr = xArr;
    }
    
    public void printObject() {
        for (X xItem : xArr) {
            System.out.println(xItem);
        }
    }
}
