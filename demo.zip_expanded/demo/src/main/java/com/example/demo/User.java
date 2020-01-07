package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class User { 
    @NotNull
    @Size(min=2, max=30)
    String name;  
    @NotNull
    @Size(min=2, max=30)
    String email;
    
    public User(String n, String e) {
    	name = n;
    	email = e;
    }
    
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
  
}  
