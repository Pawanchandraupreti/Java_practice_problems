package Ques_241_to_250;

// Generate a Pattern of Numbers in a Hourglass Shape

public class ques243 {
    public static void main(String[] args) {
        int n = 5;
        
        // Upper half
        for (int i = n; i >= 1; i--) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = 2; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
