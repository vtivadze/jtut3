/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.variables;

/**
 *
 * @author DELL
 */
public class Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte b = 10;
        short s = 2000;
        int i = 2999999;
        long n = -95959959;
        
        float f = 5.7f;
        double d = 35.000000001;
        
        boolean bool = true; // false
        
        char c = 'D';
        
        String str = "My String";
        
        String result = "";
        result += "Byte b = " + b + "\n";
        result += "Short s = " + s + "\n";
        result += "Int i = " + i + "\n";
        result += "Long n = " + n + "\n";
        result += "Float f = " + f + "\n";
        result += "Double d = " + d + "\n";
        result += "Boolean bool = " + bool + "\n";
        result += "Char c = " + c + "\n";
        result += "String str = " + str + "\n";
        
        System.out.println(result);
        
        String str_n = "53";
        int sum = Integer.parseInt(str_n) + 20;
        System.out.println(sum);
    }
    
}
