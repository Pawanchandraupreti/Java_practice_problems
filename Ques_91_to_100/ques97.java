package Ques_91_to_100;

import java.util.Scanner;

// Calculate BMI (Body Mass Index)

public class ques97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        System.out.printf("Your BMI: %.2f", bmi);
    }
}
