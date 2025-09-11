package Ques_181_to_190;

import java.util.Scanner;

// Create a Simple Text-Based Currency Converter

public class ques190 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double USD_TO_EUR = 0.85;
        final double USD_TO_GBP = 0.75;
        final double USD_TO_JPY = 110.5;
        
        System.out.println("Currency Converter (USD to others)");
        System.out.print("Enter amount in USD: ");
        double usd = scanner.nextDouble();
        
        
        System.out.printf("EUR: %.2f%n", usd * USD_TO_EUR);
        System.out.printf("GBP: %.2f%n", usd * USD_TO_GBP);
        System.out.printf("JPY: %.2f%n", usd * USD_TO_JPY);
    }
}
