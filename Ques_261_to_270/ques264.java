package Ques_261_to_270;

// Calculate the Sum of Even Fibonacci Numbers

public class ques264 {
    public static void main(String[] args) {
        int limit = 100;
        int a = 0, b = 1;
        int sum = 0;
        
        while (a <= limit) {
            if (a % 2 == 0) {
                sum += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }
        
        System.out.println("Sum of even Fibonacci numbers up to " + limit + ": " + sum);
    }
}
