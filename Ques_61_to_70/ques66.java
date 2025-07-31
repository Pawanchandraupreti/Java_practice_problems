package Ques_61_to_70;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// File Directory Scanner (NIO.2)

public class ques66 {
    public static void main(String[] args) throws IOException {
        Path dir = Paths.get(".");
        Files.walk(dir, 2)
             .filter(Files::isRegularFile)
             .forEach(path -> System.out.println(path.getFileName()));
    }
}
