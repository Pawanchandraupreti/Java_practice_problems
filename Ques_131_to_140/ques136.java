package Ques_131_to_140;

// Generate a Word Spiral

public class ques136 {
    public static void main(String[] args) {
        String word = "SPIRAL";
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(i) + word.charAt(i) + 
                             " ".repeat(n*2 - i*2 - 2) + 
                             (i != n-1 ? word.charAt(n - i - 1) : ""));
        }
    }
}
