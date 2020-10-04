/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.objectstring;

/**
 *
 * @author DELL
 */
public class ObjectString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] cArr = {'a', 'b', 'c', 'd'};
        String s1 = new String(cArr);
        System.out.println(s1);
        
        String s2 = "My new string";
        String s3 = "My new string";
        System.out.println(s2.charAt(1));
        System.out.println(s2.equals(s3));
        System.out.println(s2.startsWith("My"));
        System.out.println(s2.endsWith("ring"));
        System.out.println(s2.indexOf("ne"));
        System.out.println(s2.indexOf("not exists"));
        System.out.println(s2.replace('y', 't'));
        System.out.println(s2.substring(5));
        System.out.println(s2.substring(5, 8));
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        
        String userData = "   dddd@dddd.ru   ";
        System.out.println(userData.trim());
    }
    
}
