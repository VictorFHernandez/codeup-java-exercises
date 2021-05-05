import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){

        //part 1:
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.\n", pi);

//       part 2:

        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter your number.");
//        int number = sc.nextInt();
//        System.out.println("number " + number);

//        System.out.println("Please enter 3 words.");
//        String word1 = sc.next();
//        String word2 = sc.next();
//        String word3 = sc.next();
//        System.out.printf("%s\n%s\n%s\n", word1, word2, word3);

//        System.out.println("what do you want?");
//        String something = sc.nextLine();
//        System.out.println("you have entered:");
//        System.out.println(something);

//        part 3

        System.out.println("enter length of classroom");
        int length = Integer.parseInt(sc.nextLine());

        System.out.println("enter the width of the classroom");
        int width = Integer.parseInt(sc.nextLine());

        int area = length * width;
        int perimeter = (length * 2) + (width * 2);

        System.out.printf("the area is: %d\n", area);
        System.out.printf("the perimeter is: %d\n", perimeter);

    }
}
