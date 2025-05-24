package gpa.calculator.gpa_calculator;

public class Grade {
    
    private String grade;

    public Grade(String grade){
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getQualityPoint(){
        switch(grade){
            case "A+": return 4.3;
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "F1": return 1.7;
            case "F2": return 1.3;
            case "F3": return 0.0;
        }
        return 0.0;
    }

    

}
