package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getSting(){
    System.out.println("please enter a String");
    String input = scanner.nextLine();
    if(!input.equals("")){
        return input + " is a string";
    }else{
        System.out.println("not a string.. please enter a string");
        return getSting();
    }
}

    boolean yesNo(){
    System.out.println("enter yes or no");
    String input = scanner.nextLine();
    return input.equalsIgnoreCase("yes");
    }

    int getInteger(int min, int max) {
        System.out.println("please enter a integer between " + min + " and " + max);
        int input = scanner.nextInt();
        if (input >= 1 && input <= 10) {
            System.out.println("Thank you! valid number confirmed");
        } else {
            System.out.println("Invalid Number");
            return getInteger(min, max);
        }
        return input;
    }

    public int getInt(){
            int input;
            while (true){
                try {
                    System.out.println("Please enter an integer");
                    input = Integer.valueOf(scanner.next());
                    System.out.println(input + " is a valid integer. Thank you for your cooperation :)");
                    return input;
                }
                catch(Exception e){
                    System.out.println("Sorry, that is NOT an Integer");
                }
            }
        }

    public double getDouble(double min, double max){
        System.out.println("Enter a decimal number between " + min + " and " + max + ".");
        double input = scanner.nextDouble();
        scanner.nextLine();
        if (input >= min && input <= max){
            return input;
        }
        else {
            System.out.println("The input is not within the parameters.");
            return getDouble(min, max);
        }
    };

    public double getDouble(){
        System.out.println("Enter a decimal number.");
        if (scanner.hasNextDouble()){
            double input  = scanner.nextDouble();
            scanner.nextLine();
            return input;
        }
        else {
            String input  = scanner.next();
            scanner.nextLine();
            System.out.println("The input " + input +  " is not a decimal.");
            return getDouble();
        }
    }
}


