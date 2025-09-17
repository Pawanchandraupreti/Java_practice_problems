package Ques_191_to_200;

import java.util.Random;
import java.util.Scanner;

// Create a Simple Text-Based Dice Game

public class ques200 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your bet (1-6): ");
        int bet = scanner.nextInt();
        
        int roll = rand.nextInt(6) + 1;
        System.out.println("Dice rolled: " + roll);
        
        if (bet == roll) {
            System.out.println("Congratulations! You win 6x your bet!");
        } else {
            System.out.println("Sorry, better luck next time!");
        }
    }
}
