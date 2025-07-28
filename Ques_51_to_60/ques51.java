package Ques_51_to_60;

//File Reading and Writing

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ques51 {
    public static void main(String[] args) {
        try {
            // Write to file
            Path filePath = Paths.get("example.txt");
            Files.write(filePath, "Hello, Java File Handling!".getBytes());
            
            // Read from file
            String content = Files.readString(filePath);
            System.out.println("File content: " + content);
            
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }
    }
}
