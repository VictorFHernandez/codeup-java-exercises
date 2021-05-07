package grades;
import java.util.HashMap;



public class GradesApplication {
    public static void main(String[] args){
        HashMap<String, String> students = new HashMap<>();
        students.put("K1mPossibl3", "Kim");
        students.put("JohnC3na", "Jonh");
        students.put("BadbUnny", "Ben");
        students.put("Sp1derMan", "Peter");
        System.out.println(students);

    }
}
