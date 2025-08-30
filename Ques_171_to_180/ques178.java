package Ques_171_to_180;

// Calculate the Sum of Digits Using Recursion

public class ques178 {
    public static void main(String[] args) {
        int number = 12345;
        int sum = calculateDigitSum(number);
        System.out.println("Sum of digits: " + sum);
    }
    
    static int calculateDigitSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + calculateDigitSum(n / 10);
    }
}
