package Ques_151_to_160;

import java.util.Random;
import java.util.Scanner;

// Generate a Number Guessing Game

public class ques159 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = rand.nextInt(100) + 1;
        int attempts = 0;
        
        System.out.println("Guess a number between 1-100!");
        
        while (true) {
            System.out.print("Your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == number) {
                System.out.println("Correct! Guessed in " + attempts + " attempts");
                break;
            }
            System.out.println("Too " + (guess < number ? "low" : "high"));
        }
    }
}
