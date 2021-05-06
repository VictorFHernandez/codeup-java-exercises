package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        System.out.println(input.getSting());
        System.out.println(input.yesNo());
        int userInput = scanner.nextInt();
        System.out.println(input.getInteger(userInput, userInput));
    }
}
