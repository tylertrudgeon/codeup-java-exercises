package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;

    public Student(String aName) {
        this.name = aName;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        double gradeAvg = 0;
        for (double gradeD : grades) {
            gradeAvg += gradeD;
        } return gradeAvg / this.grades.size();
    }

}
