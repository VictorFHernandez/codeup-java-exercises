package grades;
import java.util.HashMap;



public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Students> students = new HashMap<>();
        Students Kim = new Students("Kim");
        Kim.addGrade(91);
        Kim.addGrade(99);
        Kim.addGrade(84);
        Kim.addGrade(88);
        students.put("K1mPossibl3", Kim);

        Students John = new Students("John");
        John.addGrade(64);
        John.addGrade(71);
        John.addGrade(26);
        John.addGrade(55);
        students.put("JohnC3na", John);

        Students Ben = new Students("Ben");
        Ben.addGrade(99);
        Ben.addGrade(86);
        Ben.addGrade(93);
        Ben.addGrade(70);
        students.put("BadbUnny", Ben);

        Students Peter = new Students("Peter");
        Peter.addGrade(99);
        Peter.addGrade(100);
        Peter.addGrade(96);
        Peter.addGrade(98);
        students.put("Sp1derMan", Peter);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.println("|"+students.get("BadbUnny")+"|");
    }
}
