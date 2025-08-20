package Ques_151_to_160;

import java.util.Random;
import java.util.Scanner;

// Create a Simple Dice Roll Simulator

public class ques157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("How many dice? ");
        int diceCount = scanner.nextInt();
        
        System.out.print("How many sides per die? ");
        int sides = scanner.nextInt();
        
        int total = 0;
        for (int i = 0; i < diceCount; i++) {
            int roll = rand.nextInt(sides) + 1;
            System.out.println("Die " + (i+1) + ": " + roll);
            total += roll;
        }
        
        System.out.println("Total: " + total);
    }
}
