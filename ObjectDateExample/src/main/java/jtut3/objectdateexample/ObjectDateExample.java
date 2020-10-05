/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.objectdateexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ObjectDateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println("Current time with object Date: " + d);
        
        Calendar c = new GregorianCalendar();
        c.setTime(d); // Convert Object date in Object GregorianCalendar
        
        long millis = c.getTimeInMillis();
        System.out.println("Current time in milliseconds: " + millis);
        
        String sDate = JOptionPane.showInputDialog(null, "Enter date in format 'yyyy.MM.dd HH:mm:ss':");
        System.out.println("Time entered by user: " + sDate);
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        d = format.parse(sDate); // Create Object date from string
        System.out.println("Time converted in Date format: " + d);
        
        c.setTime(d);
        c.set(GregorianCalendar.YEAR, c.get(GregorianCalendar.YEAR) + 1);
        d = c.getTime();
        System.out.println(new SimpleDateFormat("dd.MM.yyyy").format(d));
        
    }
    
}
