package Ques_11_to_20;

//Write a recursive Java method to return the nth Fibonacci number.

public class ques16 {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacci(7)); // Output will be: 13
    }
}
