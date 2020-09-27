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
public class Worker extends Person{
    private int salary = 0;
    
    public void setSalary(int salary) {
        this.salary = salary;
    } 
    
    public int getSalary() {
        return salary;
    }
    
    @Override
    public String getTextInfo() {
        String s = super.getTextInfo();
        s += " Salary: " + getSalary() + " dollars;";
        return s;
    }
}
