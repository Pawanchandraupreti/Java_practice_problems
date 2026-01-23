package Ques_291_to_300;

// Generate a Pattern of Numbers in a Diamond with Alternate Rows

public class ques293 {
    public static void main(String[] args) {
        int n = 5;
        
        // Upper half
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            if (i % 2 == 1) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = 2 * i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(" ".repeat(n - i));
            if (i % 2 == 1) {
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print(j);
                }
            } else {
                for (int j = 2 * i - 1; j >= 1; j--) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

