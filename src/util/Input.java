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
        System.out.println("please enter a decimal number between " + min + " and " + max);
        double input = scanner.nextDouble();
        if (input >= min && input <= max) {
            System.out.println("Thank you! " + input + " is a valid decimal number");
        } else {
            System.out.println("Invalid decimal number");
            return getDouble(min, max);
        }
        return input;
    }

    public double getDouble(){
        double input;
        while (true){
            try{
                System.out.println("Please enter a decimal number");
                input = Double.valueOf(scanner.next());
                System.out.println(input + " is a valid decimal number. Thank you for your cooperation :)");
                return input;
            }
            catch(Exception e){
                System.out.println("Sorry, that is NOT a decimal number");
            }
        }
    }
}


