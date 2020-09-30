/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtut3.generic;

/**
 *
 * @author DELL
 */
public class Test <X, Y> {
    private X dataX;
    private Y dataY;
    
    public Test(X dataX, Y dataY) {
        this.dataX = dataX;
        this.dataY = dataY;
    }
    
    public void print() {
        System.out.println(dataX);
        System.out.println(dataY);
    }
    
    public X getDataX() {
        return dataX;
    }
    
    public Y getDataY() {
        return dataY;
    }
    
    public void setDataX(X dataX) {
        this.dataX = dataX;
    }
    
    public void setDataY(Y dataY) {
        this.dataY = dataY;
    }
}
