import java.util.Scanner;

public class MethodsExercises {
//    exercise 1:

    public static void main(String[] args){
        System.out.println(Addition(2,2));
        System.out.println(Subtraction(6,2));
        System.out.println(Multiplication(2,2));
        System.out.println(Division(8,2));
        System.out.println(Modulus(100,8));
        System.out.println();
    }
    public static int Addition(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    public static int Subtraction(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    public static int Multiplication(int numberOne, int numberTwo){
        return numberOne * numberTwo;
    }
    public static int Division(int numberOne, int numberTwo){
        return numberOne / numberTwo;
    }
    public static int Modulus(int numberOne, int numberTwo){
        return numberOne % numberTwo;
    }

//    exercise 2:

    Scanner scan = new Scanner(System.in);

    public static void Verification(int number){
        if(number >= 1 && number <= 10){
            System.out.println("all good");
        }else {
            System.out.println("Invalid Number... please follow the rules");
        }
    }

}
