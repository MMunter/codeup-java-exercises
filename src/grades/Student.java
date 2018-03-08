package grades;
import java.util.*;

public class Student {
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    private ArrayList<Integer> grades;

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(int grade : grades){
            sum += grade;
        }

        return sum / grades.size();

    }

    public static void main(String[] args) {
        Student student1 = new Student("Marcy");
        student1.addGrade(87);
        student1.addGrade(93);
        System.out.println(student1.name + " " + student1.grades + " " + student1.getGradeAverage());

        Student nextStudent = new Student("Mark");
        nextStudent.addGrade(95);
        nextStudent.addGrade(81);
        System.out.println(nextStudent.name + " " + nextStudent.grades + " " + nextStudent.getGradeAverage());

        Student faveStudent = new Student("Max");
        faveStudent.addGrade(100);
        faveStudent.addGrade(100);
        System.out.println(faveStudent.name + " " + faveStudent.grades + " " + faveStudent.getGradeAverage());

    }

}
