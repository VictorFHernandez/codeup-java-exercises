import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Exercise 1 part A:

        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }


//         Exercise 1 Part B-1:

        int maxNumber = 100;
        int count = 0;
        do {
            System.out.println(count += 2);
        } while (count < maxNumber);


//        Exercise 1 Part B-2:

        int maxNum = 105;
        int minNum = -10;
        do {
            System.out.println(maxNum -= 5);
        } while (maxNum > minNum);


//         exercise 1 part B-3:

        long startingNumber = 2;
        long leMillion = 1000000;
        do {
            System.out.println(startingNumber);
            startingNumber *= startingNumber;
        } while (startingNumber < leMillion);

//        exercise 1 part C:

        for (int l = 5; l <= 15; l += 1) {
            System.out.println(l);
        }

        for (int p = 0; p <= 100; p += 2) {
            System.out.println(p);
        }

        for (int o = 100; o >= -10; o -= 5) {
            System.out.println(o);
        }
        for (long k = 2; k < leMillion; k *= k) {
            System.out.println(k);
        }

//        exercise 2:

        for (int m = 1; m <= 100; m++) {
            if ((m % 3 == 0) && (m % 5 == 0)) {
                System.out.println("fizzbuzz");
            } else if (m % 3 == 0){
                System.out.println("fizz");
            } else if (m % 5 == 0){
            System.out.println("buzz");
            } else {
                System.out.println(m);
            }
        }

//        exercise 3:


        Scanner scan = new Scanner(System.in);

        String userInput = "yes";

        while(userInput.equalsIgnoreCase("yes")){
            System.out.println("enter a Number... if you dare");
            int input = scan.nextInt();

            System.out.println("|   Number   |   Square   |   Cubed   |");
            System.out.println("|------------|------------|-----------|");

            for(int a = 1; a <= input; a++){
                System.out.println("| " + a + "          | " + (a * a) + "          | " + (a * a * a) + "         |");
            }
            System.out.println("Would you like to continue? YES or NO");
            userInput = scan.next();
        }

//        exercise 4:











    }
}
