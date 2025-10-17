package Ques_231_to_240;

import java.util.Random;

// Create a Simple Text-Based Dice Roll Statistics

public class ques235 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] rolls = new int[100];
        int[] frequency = new int[6];
        
        // Roll dice 100 times
        for (int i = 0; i < 100; i++) {
            int roll = rand.nextInt(6) + 1;
            rolls[i] = roll;
            frequency[roll - 1]++;
        }
        
        
        // Display statistics
        System.out.println("Dice Roll Statistics (100 rolls):");
        for (int i = 0; i < 6; i++) {
            System.out.printf("Number %d: %d times (%.1f%%)%n", 
                i + 1, frequency[i], (frequency[i] / 100.0) * 100);
        }
    }
}
