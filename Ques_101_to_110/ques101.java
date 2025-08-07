package Ques_101_to_110;

// Generate Fibonacci Sequence

public class ques101 {
    public static void main(String[] args) {
        int n = 10; // Generate first 10 Fibonacci numbers
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
