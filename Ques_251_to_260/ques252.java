package Ques_251_to_260;

import java.util.Scanner;

// Create a Simple Discount Calculator

public class ques252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter original price: $");
        double price = scanner.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();
        
        double discountAmount = price * (discount / 100);
        double finalPrice = price - discountAmount;
        
        System.out.printf("Discount amount: $%.2f%n", discountAmount);
        System.out.printf("Final price: $%.2f%n", finalPrice);
    }
}


