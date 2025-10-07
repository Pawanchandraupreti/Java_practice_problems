package Ques_221_to_230;

import java.util.Scanner;

// Create a Simple Tip Calculator

public class ques222 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter bill amount: $");
        double bill = scanner.nextDouble();
        
        System.out.print("Enter tip percentage: ");
        double tipPercent = scanner.nextDouble();
        
        double tipAmount = bill * (tipPercent / 100);
        double totalAmount = bill + tipAmount;
        
        System.out.printf("Tip: $%.2f%n", tipAmount);
        System.out.printf("Total: $%.2f%n", totalAmount);
        
    }
}
