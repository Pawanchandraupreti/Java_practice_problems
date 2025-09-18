package Ques_191_to_200;

// Generate a Word Reverse Pattern

public class ques196 {
    public static void main(String[] args) {
        String word = "PATTERN";
        
        for (int i = word.length(); i >= 1; i--) {
            System.out.println(word.substring(0, i));
        }
        
    }
}
