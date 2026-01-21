package Ques_291_to_300;

import java.util.Scanner;

// Create a Simple Savings Goal Calculator

public class ques292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your savings goal: $");
        double goal = scanner.nextDouble();
        
        System.out.print("Enter your current savings: $");
        double current = scanner.nextDouble();
        
        System.out.print("Enter monthly savings amount: $");
        double monthly = scanner.nextDouble();
        
        double needed = goal - current;
        int months = (int) Math.ceil(needed / monthly);
        
        System.out.printf("\nYou need $%.2f more%n", needed);
        System.out.println("It will take " + months + " months to reach your goal");
        
        if (months <= 0) {
            System.out.println("Congratulations! You've already reached your goal!");
        }
    }
}

