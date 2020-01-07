package com.example.demo;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
@RequestMapping(path="/valid") // This means URL's start with /valid (after Application path)
public class ValidatorController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/list").setViewName("results");
    }

    @GetMapping("/")
    public String showForm(PersonForm personForm) { return "form"; }

    @PostMapping("/")
    public String checkPersonInfo( PersonForm personForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "form";
        
        return "redirect:/list";
    }
}