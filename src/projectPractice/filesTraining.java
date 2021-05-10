package projectPractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class filesTraining {

    public static void main(String[] args) throws IOException {
        String directory = "./src/projectPractice/TxtFiles";
        String mainMenu = "mainMenu.txt";

        Path dataDirectory = Paths.get(directory);
        Path dataMainMenu = Paths.get(directory, mainMenu);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (! Files.exists(dataMainMenu)) {
            Files.createFile(dataMainMenu);
        }


    }
}
