package Ques_161_to_170;

// Calculate the Sum of Natural Numbers Using Recursion

public class ques170 {
    public static void main(String[] args) {
        int n = 10;
        int sum = calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }
    static int calculateSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + calculateSum(n - 1);
    }
}
