package Ques_251_to_260;

// Calculate the Sum of Factorials of Digits

public class ques254 {
    public static void main(String[] args) {
        int number = 145;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        
        System.out.println("Sum of factorials of digits: " + sum);
    }
    
    static int factorial(int n) {
        if (n == 0) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
