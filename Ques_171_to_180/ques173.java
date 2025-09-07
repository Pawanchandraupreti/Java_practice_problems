package Ques_171_to_180;

// Generate a Pattern of Numbers in a Diamond Shape

public class ques173 {
    public static void main(String[] args) {
        int n = 4;
        
        // Upper half
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
