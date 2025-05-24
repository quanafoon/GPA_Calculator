package gpa.calculator.gpa_calculator.controllers;

import org.springframework.web.bind.annotation.RestController;

import gpa.calculator.gpa_calculator.Grade;
import gpa.calculator.gpa_calculator.Student;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Calculate {
    
    @GetMapping("/point")
    public double getMethodName(@RequestParam String letter) {
        Grade grade = new Grade(letter);
        double qualityPoint = grade.getQualityPoint();
        return qualityPoint;
    }

    @PostMapping("/conversion")
    public double convert(@RequestBody List<String> grades){
        List<Grade> studentGrades = new ArrayList<>();
        for (String grade: grades){
            Grade g = new Grade(grade.toUpperCase());
            studentGrades.add(g);
        }
        Student student = new Student(studentGrades);
        return student.calculateGPA();
    }
    
}
