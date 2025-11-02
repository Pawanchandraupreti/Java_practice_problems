package Ques_241_to_250;

import java.util.Random;
import java.util.Scanner;

// Create a Simple Text-Based Color Guessing Game

public class ques245 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] colors = {"RED", "GREEN", "BLUE", "YELLOW", "PURPLE", "ORANGE"};
        
        String secretColor = colors[rand.nextInt(colors.length)];
        
        System.out.println("Guess the color! Options: RED, GREEN, BLUE, YELLOW, PURPLE, ORANGE");
        
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Your guess: ");
            String guess = scanner.next().toUpperCase();
            
            if (guess.equals(secretColor)) {
                System.out.println("Congratulations! You guessed correctly!");
                break;
            } else {
                attempts--;
                System.out.println("Wrong! Attempts left: " + attempts);
            }
        }
        
        
        if (attempts == 0) {
            System.out.println("Game over! The color was: " + secretColor);
        }
    }
}