import java.util.Scanner;

public class MethodsExercises {
//    exercise 1:

    public static void main(String[] args) {
        System.out.println(Addition(2, 2));
        System.out.println(Subtraction(6, 2));
        System.out.println(Multiplication(2, 2));
        System.out.println(Division(8, 2));
        System.out.println(Modulus(100, 8));
        System.out.println("Enter a number between 1 - 10");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        getInteger(userInput, userInput);
        System.out.println("Enter a number between 1 - 10");
        int userInt = scan.nextInt();
        factorial(userInt);
    }

    public static int Addition(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    public static int Subtraction(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }
    public static int Multiplication(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
    public static int Division(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }
    public static int Modulus(int numberOne, int numberTwo) {
        return numberOne % numberTwo;
    }

//    exercise 2:

    public static void getInteger(int min, int max) {
        if(min >= 1 && max <= 10) {
            System.out.println("Thank you! valid number confirmed");
        } else {
            System.out.println("Invalid Number... please follow the rules or else...");
        }
    }

//    exercise 3:

    public static void factorial(long input) {
        long factorialNum = 1;
        if(!(input <= 1 || input >= 10)){
            for (long i = 1; i <= input; i++){
                factorialNum *= i;
            }
        }else {
            System.out.println("Invalid Number");

        }
        System.out.println("The factorial number of " + input + " is: " + factorialNum);
    }

//    exercise 4:



//    exercise 5:
}
