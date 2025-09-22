package Ques_201_to_210;

import java.util.Random;

// Create a Simple Text-Based Lottery System

public class ques205 {
    public static void main(String[] args) {
        Random rand = new Random();
        int winningNumber = rand.nextInt(100) + 1;
        
        System.out.println("Lottery Draw!");
        System.out.println("The winning number is: " + winningNumber);
        
        
        // Simulate some tickets
        for (int i = 1; i <= 5; i++) {
            int ticket = rand.nextInt(100) + 1;
            System.out.println("Ticket " + i + ": " + ticket + 
                             (ticket == winningNumber ? " - WINNER!" : ""));
        }
    }
}
