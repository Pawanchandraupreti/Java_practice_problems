package Ques_181_to_190;

// Generate a Word Pyramid with Center Alignment

public class ques186 {
    public static void main(String[] args) {
        String word = "PYRAMID";
        int length = word.length();
        
        for (int i = 0; i < length; i++) {
            String line = word.substring(0, i + 1);
            System.out.println(" ".repeat(length - i - 1) + line);
        }
    }
}
