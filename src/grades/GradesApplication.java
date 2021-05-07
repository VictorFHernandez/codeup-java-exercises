package grades;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Students> students = new HashMap<>();
        Students Kim = new Students("Kim");
        Kim.addGrade(91);
        Kim.addGrade(99);
        Kim.addGrade(84);
        Kim.addGrade(88);

        Students Hunter = new Students("Hunter");
        Hunter.addGrade(64);
        Hunter.addGrade(71);
        Hunter.addGrade(26);
        Hunter.addGrade(55);

        Students Ben = new Students("Ben");
        Ben.addGrade(99);
        Ben.addGrade(86);
        Ben.addGrade(93);
        Ben.addGrade(70);

        Students Peter = new Students("Peter");
        Peter.addGrade(99);
        Peter.addGrade(100);
        Peter.addGrade(96);
        Peter.addGrade(98);

        students.put("K1mPossibl3", Kim);
        students.put("Tr1pleH", Hunter);
        students.put("BadbUnny", Ben);
        students.put("Sp1derMan", Peter);

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students:\n");
        System.out.println(students.keySet());
        System.out.println();
        System.out.println("Would you like to see the grade average of a student?");
        System.out.println("| YES or NO |");
        String userInput = scan.next();
        if(userInput.equalsIgnoreCase("yes")){
            System.out.println("No Problem");
        }else{
            System.out.println("Okay! Goodbye.. Come back soon");
        }
        System.out.println("Enter a username to see their grade");
        String usernameInput = scan.next();
        if(students.containsKey(usernameInput)){
            System.out.println(usernameInput);
        }
    }
}


