package com.example.demo;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;  


@Controller  
public class HomeController {
    
    @RequestMapping("/")  
    public String index(){ 
        return "index";  
    } 

    @RequestMapping(value="/save", method=RequestMethod.POST)  
    public ModelAndView save(@ModelAttribute User user){  
        ModelAndView modelAndView = new ModelAndView();  
        modelAndView.setViewName("user-data");      
        modelAndView.addObject("user", user);    

        return modelAndView;  
    }  

    @RequestMapping(value="/list")  
    public ModelAndView list(){  
        List<User> list = new ArrayList<>();
        
        list.add(new User("Antonio", "antoniolezzi@icloud.com"));  
        list.add(new User("Pippo", "pippo@icloud.com"));  
        list.add(new User("Pluto", "Pluto@icloud.com"));  
        list.add(new User("Paperina", "Paperina@icloud.com"));  

        ModelAndView modelAndView = new ModelAndView();
        
        modelAndView.setViewName("user-list");      
        modelAndView.addObject("users", list);    

        return modelAndView;  
    }  
}
