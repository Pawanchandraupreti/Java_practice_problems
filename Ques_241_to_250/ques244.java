package Ques_241_to_250;

// Calculate the Sum of Proper Divisors

public class ques244 {
    public static void main(String[] args) {
        int number = 28;
        int sum = 0;
        
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        
        System.out.println("Sum of proper divisors of " + number + ": " + sum);
        System.out.println(number + " is " + (sum == number ? "perfect" : "not perfect"));
    }
}