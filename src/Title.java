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
    
    public Title(int title_id,String title_name,String title_desc){
        this.setTitle_id(title_id);
        this.setTitle_name(title_name);
        this.setTitle_desc(title_desc);
    }
    
    public void setTitle_name(String title_name){
        this.title_name = title_name;
    }
    
    public String getTitle_name(){
        return title_name;
    }
    
    public void setTitle_desc(String title_desc){
        this.title_desc = title_desc;
    }
    
    public String getTitle_desc(){
        return title_desc;
    }
    
    public void setTitle_id(int title_id){
        this.title_id = title_id;
    }
    
    public int getTitle_id(){
        return title_id;
    }
    
    
}
