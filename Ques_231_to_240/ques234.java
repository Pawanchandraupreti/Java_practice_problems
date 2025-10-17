package Ques_231_to_240;

// Calculate the Sum of Cubes of Digits

public class ques234 {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        
        
        System.out.println("Sum of cubes of digits: " + sum);
    }
}
