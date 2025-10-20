package Ques_231_to_240;

import java.util.Random;

// Create a Simple Text-Based Word Scrambler

public class ques229 {
    public static void main(String[] args) {
        String word = "PROGRAMMING";
        char[] chars = word.toCharArray();
        Random rand = new Random();
        
        // Fisher-Yates shuffle
        for (int i = chars.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        
        System.out.println("Original: " + word);
        System.out.println("Scrambled: " + new String(chars));
    }
}
