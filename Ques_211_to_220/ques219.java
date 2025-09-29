package Ques_211_to_220;

import java.util.Scanner;

// Create a Simple Text-Based Hangman Game

public class ques219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "JAVA";
        StringBuilder display = new StringBuilder("_".repeat(word.length()));
        int attempts = 6;
        
        System.out.println("Welcome to Hangman!");
        System.out.println("Guess the word: " + display);
        
        while (attempts > 0 && display.toString().contains("_")) {
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toUpperCase().charAt(0);
            
            boolean found = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    display.setCharAt(i, guess);
                    found = true;
                }
            }
            
            if (!found) {
                attempts--;
                System.out.println("Wrong! Attempts left: " + attempts);
            }
            
            System.out.println("Current word: " + display);
        }
        
        if (!display.toString().contains("_")) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Game over! The word was: " + word);
        }
    }
}
