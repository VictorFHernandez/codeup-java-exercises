package grades;

import java.util.ArrayList;

public class Students {
    private ArrayList<Integer> grades;
    private final String Studentsname;

    public Students(String studentsname){
        this.Studentsname = studentsname;
        this.grades = new ArrayList<>();
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
        return averageGrade;
    }
    public static void main(String[] args){

        Students Kim = new Students("Kim");
        Kim.addGrade(91);
        Kim.addGrade(99);
        Kim.addGrade(84);
        Kim.addGrade(88);
        System.out.println("The grade average for " + Kim.getName() + " is: " + Kim.getGradeAverage());
    }
}
