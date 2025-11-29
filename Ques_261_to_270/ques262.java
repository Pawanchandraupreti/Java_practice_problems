package Ques_261_to_270;

import java.util.Scanner;

// Create a Simple Tax Calculator

public class ques262 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your income: $");
        double income = scanner.nextDouble();
        
        System.out.print("Enter tax rate (%): ");
        double taxRate = scanner.nextDouble();
        
        double taxAmount = income * (taxRate / 100);
        double netIncome = income - taxAmount;
        
        System.out.printf("Tax amount: $%.2f%n", taxAmount);
        System.out.printf("Net income: $%.2f%n", netIncome);
    }
}


