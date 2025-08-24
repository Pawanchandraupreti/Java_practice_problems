package Ques_151_to_160;

import java.util.Scanner;

// Create a Simple Text-Based Calculator

public class ques160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        
        System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);
    }
}
