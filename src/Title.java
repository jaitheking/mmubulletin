/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaitheking
 */
public class Title {
    private String title_name;
    private String title_desc;
    
    public Title(String name,String desc){
        this.settitle_name(name);
        this.settitle_desc(desc);
    }
    
    public void settitle_name(String name){
        title_name = name;
    }
    
    public String gettitle_name(){
        return title_name;
    }
    
    public void settitle_desc(String desc){
        title_desc = desc;
    }
    
    public String gettitle_desc(){
        return title_desc;
    }
}
