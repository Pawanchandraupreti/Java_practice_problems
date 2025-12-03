package Ques_261_to_270;

// Generate a Word Mirror Pattern

public class ques261 {
    public static void main(String[] args) {
        String word = "MIRROR";
        int length = word.length();
        
        for (int i = 0; i < length; i++) {
            System.out.print(word.substring(0, i + 1));
            System.out.print(" ".repeat(length - i - 1));
            System.out.print(" ".repeat(length - i - 1));
            System.out.print(new StringBuilder(word.substring(0, i + 1)).reverse());
            System.out.println();
        }
    }
}