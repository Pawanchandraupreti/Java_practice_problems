package Ques_111_to_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Simple File Encryption (Caesar Cipher)

public class ques120 {
    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\upret\\OneDrive\\Desktop\\Java problems\\Ques_111_to_120\\secret.txt")));
        int shift = 3;
        StringBuilder encrypted = new StringBuilder();
        
        for (char c : content.toCharArray()) {
            encrypted.append((char)(c + shift));
        }
        
        Files.write(Paths.get("C:\\Users\\upret\\OneDrive\\Desktop\\Java problems\\Ques_111_to_120\\encrypted.txt"), encrypted.toString().getBytes());
        System.out.println("File encrypted!");
    }
}
