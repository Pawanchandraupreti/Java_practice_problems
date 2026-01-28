package Ques_291_to_300;

// Generate a Pattern of Fibonacci Numbers in a Diamond

public class ques300 {
    public static void main(String[] args) {
        int n = 4;
        int a = 0, b = 1;
        
        // Upper half
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }
    }
}


