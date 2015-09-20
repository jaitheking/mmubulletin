/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaitheking
 */
public class User {
            private int user_id;
            private String user_pass;
            private String user_type;
            public static User new_user;
            
            public User(int userid,String user_type){
                this.setUsername(user_id);
                this.setType(user_type);
            }
            
            
            public void setUsername(int user_id){
                this.user_id = user_id;
            }
            
            public int getUsername(){
                return user_id;
            }
            
            private void setPassword(String password){
                this.user_pass = password;
            }
            
            private String getPassword(){
                return user_pass;
            }
            
            public void setType(String type){
                this.user_type = type;
            }
            
            public String getType(){
                return user_type;
            }
            
}
