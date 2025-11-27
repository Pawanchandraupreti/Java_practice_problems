package Ques_251_to_260;

// Generate a Pattern of Fibonacci Numbers in a Right Triangle

public class ques260 {
    public static void main(String[] args) {
        int rows = 5;
        int a = 0, b = 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%4d", a);
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }
}