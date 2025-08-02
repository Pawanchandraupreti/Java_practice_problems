package Ques_71_to_80;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// File Copy with Progress Tracking

public class ques76 {
    public static void copyWithProgress(String source, String dest) throws IOException {
        // Create source file if doesn't exist
        if (!Files.exists(Paths.get(source))) {
            Files.write(Paths.get(source), "Default content".getBytes());
        }
        
        long total = Files.size(Paths.get(source));
        try (InputStream in = Files.newInputStream(Paths.get(source));
             OutputStream out = Files.newOutputStream(Paths.get(dest))) {
            
            byte[] buffer = new byte[1024];
            long copied = 0;
            int read;
            
            while ((read = in.read(buffer)) > 0) {
                out.write(buffer, 0, read);
                copied += read;
                System.out.printf("Copied: %d/%d bytes (%.1f%%)\n", 
                    copied, total, (copied*100.0/total));
            }
        }
    }

    public static void main(String[] args) {
        try {
            copyWithProgress("C:\\Users\\upret\\OneDrive\\Desktop\\Java problems\\Ques_71_to_80\\source.txt", "C:\\Users\\upret\\OneDrive\\Desktop\\Java problems\\Ques_71_to_80\\dest.txt");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
