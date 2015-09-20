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
    private int title_id;
    public static Title title_chosen;
    
    public Title(int id ,String name,String desc){
        this.setTitle_id(id);
        this.setTitle_name(name);
        this.setTitle_desc(desc);
    }
    
    public void setTitle_name(String name){
        this.title_name = name;
    }
    
    public String getTitle_name(){
        return title_name;
    }
    
    public void setTitle_desc(String desc){
        this.title_desc = desc;
    }
    
    public String getTitle_desc(){
        return title_desc;
    }
    
    public void setTitle_id(int id){
        this.title_id = id;
    }
    
    public int getTitle_id(){
        return title_id;
    }
    
    
}
