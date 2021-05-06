package util;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    String getSting(){
    System.out.println("please enter a String");
    String input = scanner.nextLine();
    if(!input.equals("")){
        return input + " is a string";
    }else{
        String notInput = "not a string";
        return notInput;
    }
}

    boolean yesNo(){
    System.out.println("enter yes or no");
    String input = scanner.nextLine();
    return input.equalsIgnoreCase("yes");
    }

    int getInteger(int min, int max) {
        if(min >= 1 && max <= 10) {
            System.out.println("Thank you! valid number confirmed");
        }else {
            System.out.println("Invalid Number");
        }
           return min;
    }

    int getInt(){
        System.out.println("enter a number");

        return scanner.nextInt();
    }


}

