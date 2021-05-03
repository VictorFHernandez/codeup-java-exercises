package util;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
    Input input = new Input();
    System.out.println(input.yesNo());
}

//String getSting(){
//    System.out.println("please enter a word");
//    String input = scanner.nextLine();
//    if(!input.equals("")){
//        return input;
//    }else{
//        return input;
//    }
//}

    public boolean yesNo(){
    System.out.println("enter yes or no");
    String input = scanner.nextLine();
    return input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("no");
    }
}

