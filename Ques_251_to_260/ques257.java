package Ques_251_to_260;

// Generate a Pattern of Numbers in a Diamond with Borders

public class ques257 {
    public static void main(String[] args) {
        int n = 4;
        
        // Upper half
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.print("1");
            if (i > 1) {
                System.out.print(" ".repeat(2 * i - 3));
                System.out.print(i);
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(" ".repeat(n - i));
            System.out.print("1");
            if (i > 1) {
                System.out.print(" ".repeat(2 * i - 3));
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
