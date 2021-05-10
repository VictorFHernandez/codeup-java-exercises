package projectPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class filesTraining {

    public static void main(String[] args) throws IOException {
        String directory = "./src/projectPractice/TxtFiles";
        String mainMenu = "mainMenu.txt";


        Path DataDirectory = Paths.get(directory);
        Path DataMainMenu = Paths.get(directory, mainMenu);

        if (Files.notExists(DataDirectory)) {
            Files.createDirectories(DataDirectory);
        }

        if (! Files.exists(DataMainMenu)) {
            Files.createFile(DataMainMenu);
        }

        Path menuTxtPath = Paths.get(directory, mainMenu);

        List<String> MainMenu = Arrays.asList(
                "View contacts.",
                "Add a new contact.",
                "Search a contact by name.",
                "Delete an existing contact.",
                "Exit."
        );

        Files.write(menuTxtPath, MainMenu);


    }
}
