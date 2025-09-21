package Ques_201_to_210;

// Generate a Word Diamond Pattern

public class ques201 {
    public static void main(String[] args) {
        String word = "DIAMOND";
        int n = word.length();
        
        // Upper half
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(n - i - 1));
            System.out.print(word.substring(0, i + 1));
            if (i > 0) {
                System.out.print(new StringBuilder(word.substring(0, i)).reverse());
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = n - 2; i >= 0; i--) {
            System.out.print(" ".repeat(n - i - 1));
            System.out.print(word.substring(0, i + 1));
            if (i > 0) {
                System.out.print(new StringBuilder(word.substring(0, i)).reverse());
            }
            System.out.println();
        }
    }
}
