package Ques_241_to_250;

import java.util.Scanner;

// Create a Simple Loan Payment Calculator

public class ques242 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter loan amount: $");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble();
        
        System.out.print("Enter loan term (years): ");
        int years = scanner.nextInt();
        
        double monthlyRate = annualRate / 100 / 12;
        int months = years * 12;
        double monthlyPayment = (principal * monthlyRate) / 
                               (1 - Math.pow(1 + monthlyRate, -months));
        
        System.out.printf("Monthly payment: $%.2f%n", monthlyPayment);
    }
    
}
