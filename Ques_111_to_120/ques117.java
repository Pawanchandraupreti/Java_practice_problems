package Ques_111_to_120;

import java.io.BufferedReader;
import java.io.FileReader;

// Read File and Count Lines

public class ques117 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            long lineCount = reader.lines().count();
            System.out.println("Total lines: " + lineCount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
