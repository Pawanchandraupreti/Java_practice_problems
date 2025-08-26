package Ques_161_to_170;

import java.util.Scanner;

// Create a Simple Unit Converter (Miles to Kilometers)

public class ques167 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.printf("%.2f miles = %.2f kilometers%n", miles, kilometers);
    }
}
