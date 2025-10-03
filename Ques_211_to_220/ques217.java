package Ques_211_to_220;

// Generate a Pattern of Letters in a Diamond Shape

public class ques217 {
    public static void main(String[] args) {
        int n = 4;
        char currentChar = 'A';
        
        // Upper half
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
            currentChar = 'A';
        }
        
        
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            System.out.print(" ".repeat(n - i));
            for (int j = 1; j <= i; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
            currentChar = 'A';
        }
    }
}
