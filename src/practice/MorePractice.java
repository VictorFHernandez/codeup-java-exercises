package practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MorePractice {
    public static void main(String[] args) throws IOException {
        String directory = "./src/practice/data";
        String mainMenu = "menu.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataMainMenu = Paths.get(directory, mainMenu);
//        System.out.println(dataMainMenu);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataMainMenu)) {
            Files.createFile(dataMainMenu);
        }

        Path menuTxtPath = Paths.get(directory, mainMenu);

        List<String> MainMenu = Arrays.asList(
                "View contacts.",
                "Add a new contact.",
                "Search a contact by name.",
                "Delete an existing contact.",
                "Exit."
        );
//        System.out.println(MainMenu);

        Files.write(menuTxtPath, MainMenu);
//
        Path menuPath = Paths.get(directory, mainMenu);
        List<String> menuList = Files.readAllLines(menuPath);

        for(int i = 0; i < menuList.size(); i += 1){
            System.out.println((i + 1) + ": " + menuList.get(i));
        }

//        Files.write(
//                Paths.get(directory, mainMenu),
//                Arrays.asList("appened stuff"),
//                StandardOpenOption.APPEND
//        );
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");

    }
}
