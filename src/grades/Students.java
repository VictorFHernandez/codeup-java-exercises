package grades;

import java.util.ArrayList;

public class Students {
    private ArrayList<Integer> grades;
    private final String Studentsname;

    public Students(String studentsname){
        this.Studentsname = studentsname;
        this.grades = new ArrayList<Integer>();
    }


    public String getName(){
        return this.Studentsname;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double totalGrades = 0;
        for(double grade : grades){
            totalGrades += grade;
        }
        double averageGrade = totalGrades / grades.size();
        System.out.println("The grade average for " + this.getName() + " is: " + averageGrade);
        return averageGrade;
    }
    public static void main(String[] args){
        Students Kim = new Students("Kim");
        Kim.addGrade(91);
        Kim.addGrade(99);
        Kim.addGrade(84);
        Kim.addGrade(88);
        Kim.getGradeAverage();
        System.out.println();
        Students John = new Students("John");
        John.addGrade(64);
        John.addGrade(71);
        John.addGrade(26);
        John.addGrade(55);
        John.getGradeAverage();
        System.out.println();
        Students Ben = new Students("Ben");
        Ben.addGrade(99);
        Ben.addGrade(86);
        Ben.addGrade(93);
        Ben.addGrade(70);
        Ben.getGradeAverage();
        System.out.println();
        Students Peter = new Students("Peter");
        Peter.addGrade(99);
        Peter.addGrade(100);
        Peter.addGrade(96);
        Peter.addGrade(98);
        Peter.getGradeAverage();
        System.out.println();
    }
}
