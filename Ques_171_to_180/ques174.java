package Ques_171_to_180;

import java.util.Random;
import java.util.Scanner;

// Create a Simple Text-Based Roulette Game

public class ques174 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Guess a number between 0 and 36: ");
        int guess = scanner.nextInt();
        
        
        int result = rand.nextInt(37);
        System.out.println("The wheel spins... " + result + "!");
        
        if (guess == result) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Sorry, better luck next time!");
        }
    }
}
