package Ques_281_to_290;

import java.util.Scanner;

// Create a Simple Compound Interest Calculator with Regular Contributions

public class ques282 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial principal: $");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (%): ");
        double rate = scanner.nextDouble();
        
        System.out.print("Enter years: ");
        int years = scanner.nextInt();
        
        System.out.print("Enter monthly contribution: $");
        double monthlyContribution = scanner.nextDouble();
        
        double monthlyRate = rate / 100 / 12;
        int months = years * 12;
        double futureValue = principal;
        
        for (int i = 0; i < months; i++) {
            futureValue = futureValue * (1 + monthlyRate) + monthlyContribution;
        }
        
        double totalContributions = principal + (monthlyContribution * months);
        double totalInterest = futureValue - totalContributions;
        
        System.out.printf("\nFuture Value: $%.2f%n", futureValue);
        System.out.printf("Total Contributions: $%.2f%n", totalContributions);
        System.out.printf("Total Interest Earned: $%.2f%n", totalInterest);
    }
}
