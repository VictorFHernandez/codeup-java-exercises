package util;

import java.util.Scanner;

public class Input {
//    private class scanner;

    Scanner scanner = new Scanner(System.in);

    public String getString() {
        String input = scanner.nextLine();

        System.out.println("Enter a string.");
        input = scanner.nextLine();
        if (!input.equals("")){
            return input;
        }
        else {
            System.out.println("Please enter a string");
            return getString();
        }
    }
}
