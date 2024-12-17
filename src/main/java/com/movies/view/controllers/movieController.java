package com.movies.view.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller public class movieController { 
    
    @GetMapping("/") 
    public String home() { 
        return "pages/home";  }
     
    }

