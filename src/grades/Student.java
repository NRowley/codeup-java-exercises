package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> studentGrades;

    public Student(String name){
        this.studentName = name;
        this.studentGrades = new ArrayList<>();
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void addGrade(int grade){
        this.studentGrades.add(grade);
    }

    public double getGradeAverage(){
        double gradeTotal = 0;
        for(int i = 0; i < this.studentGrades.size(); i++){
            gradeTotal = gradeTotal + this.studentGrades.get(i);
        }
        return gradeTotal/this.studentGrades.size();
    }
}
