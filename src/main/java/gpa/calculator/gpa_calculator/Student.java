package gpa.calculator.gpa_calculator;

import java.util.List;

public class Student {
    
    public List<Grade> grades;
    public int classes;
    public double GPA;
    
    public Student(List<Grade> grades) {
        this.grades = grades;
        this.classes = grades.size();
    }
    public List<Grade> getGrades() {
        return grades;
    }
    public int getClasses() {
        return classes;
    }
    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
    public void setClasses(int classes) {
        this.classes = classes;
    }
    public double getGPA() {
        return GPA;
    }
    public double calculateGPA(){
        double total=0.0;
        for(Grade grade : grades){
            total += (grade.getQualityPoint() *3);
        }
        this.GPA =  total/(classes*3);
        return GPA;
    }
}
