package Ques_211_to_220;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// Create a Simple Age Calculator

public class ques212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your birth year: ");
        int year = scanner.nextInt();
        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter your birth day: ");
        int day = scanner.nextInt();
        
        LocalDate birthDate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period age = Period.between(birthDate, today);
        
        System.out.printf("You are %d years, %d months, and %d days old%n",
                         age.getYears(), age.getMonths(), age.getDays());
    }
}
