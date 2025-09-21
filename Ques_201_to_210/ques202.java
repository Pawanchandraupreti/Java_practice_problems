package Ques_201_to_210;

import java.util.Scanner;

// Create a Simple Temperature Converter

public class ques202 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.print("Enter temperature: ");
        double temp = scanner.nextDouble();
        
        System.out.print("Convert from (C/F): ");
        char from = scanner.next().charAt(0);
        
        if (from == 'C' || from == 'c') {
            double fahrenheit = (temp * 9/5) + 32;
            System.out.printf("%.1f°C = %.1f°F%n", temp, fahrenheit);
        } else {
            double celsius = (temp - 32) * 5/9;
            System.out.printf("%.1f°F = %.1f°C%n", temp, celsius);
        }
    }
}
