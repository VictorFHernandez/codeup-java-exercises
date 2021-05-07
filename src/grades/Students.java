package grades;

import java.util.ArrayList;

public class Students {
    private ArrayList<Integer> Grades = new ArrayList<>();

    private String name;

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        Grades.add(grade);
    }

//    public double getGradeAverage(){
//
//    }
    public static void main(String[] args){

    }
}
