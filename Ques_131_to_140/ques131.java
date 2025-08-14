package Ques_131_to_140;

// Generate a Word Pyramid

public class ques131 {
    public static void main(String[] args) {
        String word = "PYRAMID";
        for (int i = 0; i < word.length(); i++) {
            System.out.println(" ".repeat(word.length()-i-1) + 
                             word.substring(0, i+1));
        }
    }
}
