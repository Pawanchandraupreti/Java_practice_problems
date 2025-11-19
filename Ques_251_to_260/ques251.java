package Ques_251_to_260;

// Generate a Word Staircase Pattern

public class ques251 {
    public static void main(String[] args) {
        String word = "STAIRCASE";
        
        for (int i = 0; i < word.length(); i++) {
            System.out.println(" ".repeat(i) + word.charAt(i));
        }
        
        for (int i = word.length() - 2; i >= 0; i--) {
            System.out.println(" ".repeat(i) + word.charAt(i));
        }
    }
}


