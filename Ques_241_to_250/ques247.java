package Ques_241_to_250;

// Generate a Pattern of Numbers in a Butterfly Shape

public class ques247 {
    public static void main(String[] args) {
        int n = 4;
        
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print(" ".repeat(2 * (n - i)));
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        // Lower half
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.print(" ".repeat(2 * (n - i)));
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
