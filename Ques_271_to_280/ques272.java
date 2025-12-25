// Create a Simple Profit/Loss Calculator

import java.util.Scanner;

public class ques272 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter cost price: $");
        double costPrice = scanner.nextDouble();
        
        System.out.print("Enter selling price: $");
        double sellingPrice = scanner.nextDouble();
        
        double difference = sellingPrice - costPrice;
        
        if (difference > 0) {
            System.out.printf("Profit: $%.2f (%.2f%%)%n", 
                difference, (difference / costPrice) * 100);
        } else if (difference < 0) {
            System.out.printf("Loss: $%.2f (%.2f%%)%n", 
                Math.abs(difference), (Math.abs(difference) / costPrice) * 100);
        } else {
            System.out.println("No profit, no loss");
        }
    }
}