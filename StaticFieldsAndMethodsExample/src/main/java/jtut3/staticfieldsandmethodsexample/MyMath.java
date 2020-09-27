/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.staticfieldsandmethodsexample;

/**
 *
 * @author DELL
 */
public class MyMath {
    private static int count = 0;
    
    public static int add(int parFrst, int parScnd) {
        count++;
        return parFrst + parScnd;
    }
    
    public static int sub(int parFrst, int parScnd) {
        count++;
        return parFrst - parScnd;
    }
    
    public static int mult(int parFrst, int parScnd) {
        count++;
        return parFrst * parScnd;
    }
    
    public static double div(double parFrst, double parScnd) {
        count++;
        return parFrst / parScnd;
    }
    
    public static int getCount() {
        return count;
    }
}
