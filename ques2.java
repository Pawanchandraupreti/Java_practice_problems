//Write a Java program that takes two numbers as input and returns their sum.

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first no: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second no: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}
