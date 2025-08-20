package Ques_151_to_160;

import java.util.Scanner;

// Calculate Body Mass Index (BMI) with Categories

public class ques158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        String category;
        
        if (bmi < 18.5) category = "Underweight";
        else if (bmi < 25) category = "Normal";
        else if (bmi < 30) category = "Overweight";
        else category = "Obese";
        
        System.out.printf("BMI: %.1f (%s)%n", bmi, category);
    }
}
