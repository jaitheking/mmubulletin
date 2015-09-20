/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaitheking
 */
public class Subject {
    private String subject_title;
    public static Subject discuss_subject;
    
    public Subject(String title){
        this.setSubjTitle(title);
    }
    
    public void setSubjTitle(String title){
        this.subject_title = title;
    }
    
    public String getSubjTitle(){
        return subject_title;
    }
    
   
}
