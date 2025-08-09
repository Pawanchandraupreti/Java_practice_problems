package Ques_101_to_110;

import java.util.Scanner;

// Calculate Simple Interest

public class ques102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter time (years): ");
        double time = sc.nextDouble();
        
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}
