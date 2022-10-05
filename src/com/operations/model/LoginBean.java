package com.operations.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Model -> POJO +business logic
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginBean {  
private String username,password;



public boolean validate(){  
    if(username.equals("saran")&&password.equals("123")){  
        return true;  
    }  
    else{  
        return false;  
    }  
}  
}  
