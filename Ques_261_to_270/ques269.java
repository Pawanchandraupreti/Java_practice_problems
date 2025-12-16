package Ques_261_to_270;

import java.util.Scanner;

// Create a Simple Text-Based Consonant Counter

public class ques269 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        
        int consonantCount = 0;
        String vowels = "aeiou";
        
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c) && vowels.indexOf(c) == -1) {
                consonantCount++;
            }
        }
        
        System.out.println("Number of consonants: " + consonantCount);
    }
}

