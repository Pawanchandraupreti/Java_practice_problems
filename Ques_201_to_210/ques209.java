package Ques_201_to_210;

import java.util.Random;
import java.util.Scanner;

// Create a Simple Text-Based Coin Flip Game

public class ques209 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Heads or Tails? (H/T): ");
        char guess = scanner.next().charAt(0);
        
        boolean isHeads = rand.nextBoolean();
        String result = isHeads ? "Heads" : "Tails";
        
        System.out.println("The coin shows: " + result);
        
        if ((guess == 'H' || guess == 'h') && isHeads) {
            System.out.println("You win!");
        } else if ((guess == 'T' || guess == 't') && !isHeads) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}
