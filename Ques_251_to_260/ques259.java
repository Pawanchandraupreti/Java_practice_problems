package Ques_251_to_260;

import java.util.Scanner;

// Create a Simple Text-Based Vowel Counter

public class ques259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();
        
        int vowelCount = 0;
        String vowels = "aeiou";
        
        for (char c : sentence.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }
        
        System.out.println("Number of vowels: " + vowelCount);
    }
}

