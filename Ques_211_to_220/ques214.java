package Ques_211_to_220;

// Calculate the Harmonic Series Sum

public class ques214 {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.printf("1/%d = %.4f%n", i, 1.0/i);
        }
        
        
        System.out.printf("Sum of first %d terms: %.4f%n", n, sum);
    }
}
