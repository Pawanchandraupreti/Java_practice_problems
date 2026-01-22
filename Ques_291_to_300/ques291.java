package Ques_291_to_300;

// Generate a Word Spiral Clockwise

public class ques291 {
    public static void main(String[] args) {
        String word = "SPIRAL";
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(i) + word.charAt(i) + 
                             " ".repeat(n - i - 1) + 
                             " ".repeat(n - i - 1) + 
                             word.charAt(n - i - 1));
        }
    }
}
