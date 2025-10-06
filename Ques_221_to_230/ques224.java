package Ques_221_to_230;

// Calculate the Sum of Squares of Digits

public class ques224 {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        
        System.out.println("Sum of squares of digits: " + sum);
    }
}
