package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;  


@RestController  
public class JsonController {
    @RequestMapping("/hello")  
    public String hello(){  
        return"Hello!";  
    } 
    
    @RequestMapping("/user")  
    public User index(){  
        
        return new User("Antonio", "antoniolezzi@icloud.com");  
    } 

    @RequestMapping("/listuser")  
    public List<User> list(){  
        List<User> list = new ArrayList<>();
        
        list.add(new User("Antonio", "antoniolezzi@icloud.com"));  
        list.add(new User("Pippo", "pippo@icloud.com"));  
        list.add(new User("Pluto", "Pluto@icloud.com"));  
        
        return list;
    } 

}
