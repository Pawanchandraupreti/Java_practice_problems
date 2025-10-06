package Ques_221_to_230;

// Generate a Word Spiral Outwards

public class ques221 {
    public static void main(String[] args) {
        String word = "SPIRAL";
        int n = word.length();
        
        for (int i = 0; i < n; i++) {
            System.out.print(" ".repeat(i));
            System.out.print(word.charAt(i));
            System.out.print(" ".repeat(n - i - 1));
            if (i != n - 1) {
                System.out.print(word.charAt(n - i - 1));
            }
            System.out.println();
        }
    }
}
