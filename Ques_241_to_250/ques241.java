package Ques_241_to_250;

// Generate a Word Reflection Pattern

public class ques241 {
    public static void main(String[] args) {
        String word = "REFLECTION";
        
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i));
            System.out.print(" ".repeat(word.length() - i - 1));
            System.out.print(word.charAt(word.length() - i - 1));
            System.out.println();
        }
    }
    
}