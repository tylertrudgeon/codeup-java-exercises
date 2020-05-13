package grades;

import java.util.ArrayList;

public class Student {

    public static void main (String[] args) {
       Student student = new Student ("Tyler");

        student.addGrade(89);
        student.addGrade(91);
        student.addGrade(92);
        student.addGrade(99);

        System.out.println(student.getName() + "'s grades = " + student.grades);

        System.out.println("GPA : " + student.getGradeAverage());



    }

    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage() {
        double gradeAvg = 0;
        for (double gradeD : grades) {
            gradeAvg += gradeD;
        } return gradeAvg / grades.size();
    }

}
