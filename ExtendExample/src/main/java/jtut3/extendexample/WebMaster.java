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
public class WebMaster extends User {
    private String site;
    
    public WebMaster(int id, String login, String password, String site) {
        super(id, login, password);
        this.site = site;
    }
    
    public WebMaster() {
        super();
        site = "";
    }
    
    public String getSite() {
        return site;
    }
    
    public void setSite(String site) {
        this.site = site;
    }
    
    @Override
    public String getTextInfo() {
        String s = super.getTextInfo();
        s += " Site: " + getSite() + ";";
        return s;
    }
}
