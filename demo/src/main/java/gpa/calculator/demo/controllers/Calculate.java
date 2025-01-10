package gpa.calculator.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import gpa.calculator.demo.Grade;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Calculate {
    
    @GetMapping("/point")
    public double getMethodName(@RequestParam String letter) {
        Grade grade = new Grade(letter);
        double qualityPoint = grade.getQualityPoint();
        return qualityPoint;
    }
    
}
