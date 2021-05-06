package util;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    String getSting(){
    System.out.println("please enter a word");
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
    return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no");
    }

    int getInteger(int min, int max) {
        int invalid = 0;
        System.out.println("enter a number between 1 - 10");
        if(min >= 1 && max <= 10) {
            System.out.println("Thank you! valid number confirmed");
        }
           return min;//
    }


}

