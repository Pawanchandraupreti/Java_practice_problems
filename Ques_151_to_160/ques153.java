package Ques_151_to_160;

// Calculate Compound Interest

public class ques153 {
    public static void main(String[] args) {
        double principal = 1000;
        double rate = 5; // 5% annual
        int years = 10;
        
        double amount = principal * Math.pow(1 + rate/100, years);
        System.out.printf("After %d years: $%.2f%n", years, amount);
    }
}
