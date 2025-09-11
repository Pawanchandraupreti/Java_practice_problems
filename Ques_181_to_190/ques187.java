package Ques_181_to_190;

import java.util.Random;
import java.util.Scanner;

// Create a Simple Number Guessing Game with Hints

public class ques187 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = rand.nextInt(100) + 1;
        int attempts = 0;
        
        System.out.println("Guess a number between 1-100 (I'll give you hints!)");
        
        while (true) {
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            
            if (guess == number) {
                System.out.println("Correct! Guessed in " + attempts + " attempts");
                break;
            }
            
            int difference = Math.abs(guess - number);
            if (difference <= 5) {
                System.out.println("Very hot!");
            } else if (difference <= 15) {
                System.out.println("Warm!");
            } else if (difference <= 30) {
                System.out.println("Cold!");
            } else {
                System.out.println("Very cold!");
            }
        }
    }
}
