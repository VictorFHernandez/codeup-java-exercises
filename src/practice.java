import java.util.Scanner;

public class practice {

    public static void main(String[] args){
        System.out.println("Hey! lets get it started");
        System.out.println();
        randomNumber();
        System.out.println("having fun? | yes or no |");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        System.out.print("you've entered " + input);

    }
    static void randomNumber(){
        double numbers = Math.ceil(Math.random() * 100);
        System.out.println("Your welcome code is " + numbers);
        System.out.println("Don't forget ;)");
    }




}
