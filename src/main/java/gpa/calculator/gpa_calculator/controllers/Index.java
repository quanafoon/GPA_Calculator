package gpa.calculator.gpa_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {
    
    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/calculator")
    public String calculator(){
        return "calculator";
    }
}
