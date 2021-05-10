package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args){
        Input input = new Input();
        System.out.println(input.getSting());
        System.out.println(input.yesNo());
        System.out.println(input.getInteger(1, 10));
        System.out.println(input.getInt());
        System.out.println(input.getDouble(1, 10));
        System.out.println(input.getDouble());
    }
}
