package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PrintController {
    File path = null;
    public void printToTextFile(String numberPattern) throws IOException {
        //creating the instance of file
        path = new File("/Users/malshaniwijekoon/Documents/Projects/NumberGeneration/src/main/resources/numberPattern.txt");

        //write and append to file
        Files.write(Paths.get(String.valueOf(path)), numberPattern.getBytes(), StandardOpenOption.APPEND);
    }

    public void printCategory(String patternCategory) throws IOException {
        path = new File("/Users/malshaniwijekoon/Documents/Projects/NumberGeneration/src/main/resources/patternCategory.txt");
        Files.write(Paths.get(String.valueOf(path)), patternCategory.getBytes(), StandardOpenOption.APPEND);
    }
}
