//Write a Java program to find the largest among three numbers.

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first no: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second no: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third no: ");
        int num3 = scanner.nextInt();
        
        int l = num1;
        if (num2 > l) {
            l = num2;
        }
        if (num3 > l) {
            l = num3;
        }
        
        System.out.println("Largest no is: " + l);
    }
}
