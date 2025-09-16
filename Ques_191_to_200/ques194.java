package Ques_191_to_200;

import java.util.Random;
import java.util.Scanner;

// Create a Simple Text-Based Rock-Paper-Scissors Game

public class ques194 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String[] choices = {"Rock", "Paper", "Scissors"};
        
        System.out.println("Enter your choice (0=Rock, 1=Paper, 2=Scissors):");
        int playerChoice = scanner.nextInt();
        int computerChoice = rand.nextInt(3);
        
        System.out.println("You chose: " + choices[playerChoice]);
        
        System.out.println("Computer chose: " + choices[computerChoice]);
        
        if (playerChoice == computerChoice) {
            System.out.println("It's a tie!");
        } else if ((playerChoice == 0 && computerChoice == 2) ||
                   (playerChoice == 1 && computerChoice == 0) ||
                   (playerChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
