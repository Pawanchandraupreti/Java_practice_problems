package Ques_171_to_180;

// Generate a Word Triangle

public class ques171 {
    public static void main(String[] args) {
        String word = "TRIANGLE";
        
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0, i + 1));
        }
        for (int i = word.length() - 2; i >= 0; i--) {
            System.out.println(word.substring(0, i + 1));
        }
    }
}
