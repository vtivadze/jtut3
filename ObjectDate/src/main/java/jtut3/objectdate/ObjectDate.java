/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.objectdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author DELL
 */
public class ObjectDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println("Current date: " + d);
        
        Calendar c = new GregorianCalendar();
        System.out.println(c.getTimeInMillis());
        
        c.setTime(new Date());
        System.out.println("Current gregorian calendar date: " + c);
        
        c.set(1980, 12, 12, 14, 0, 30);
        System.out.println(c.getTimeInMillis());
        
        c.set(GregorianCalendar.YEAR, 2020);
        c.set(GregorianCalendar.MONTH, 10);
        c.set(GregorianCalendar.DAY_OF_MONTH, 5);
        c.set(GregorianCalendar.HOUR, 22);
        c.set(GregorianCalendar.MINUTE, 15);
        c.set(GregorianCalendar.SECOND, 27);
        System.out.println(c.getTimeInMillis());
        
        System.out.println(c.get(GregorianCalendar.YEAR));
        System.out.println(c.get(GregorianCalendar.MONTH));
        System.out.println(c.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println(c.get(GregorianCalendar.HOUR));
        System.out.println(c.get(GregorianCalendar.MINUTE));
        System.out.println(c.get(GregorianCalendar.SECOND));
        System.out.println(c.get(GregorianCalendar.MILLISECOND));
        
        String date = "15.12.2015 12:00:00";
        SimpleDateFormat format =  new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        d = format.parse(date);
        c.setTime(d);
        System.out.println(c.get(GregorianCalendar.YEAR));
        System.out.println(d);
        
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm წამები=ss").format(d));
    }
    
}
