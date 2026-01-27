package Ques_291_to_300;

import java.util.Scanner;

// Create a Simple Text-Based Word Reverser

public class ques299 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        
        for (String word : words) {
            reversed.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println("Reversed words: " + reversed.toString().trim());
    }
}
