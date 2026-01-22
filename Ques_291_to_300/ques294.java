package Ques_291_to_300;

// Calculate the Number of Trailing Zeros in Factorial

public class ques294 {
    public static void main(String[] args) {
        int n = 20;
        int count = 0;
        
        for (int i = 5; i <= n; i *= 5) {
            count += n / i;
        }
        System.out.println(n + "! has " + count + " trailing zeros");
        
        if (n <= 20) {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            String factStr = String.valueOf(factorial);
            int trailing = 0;
            for (int i = factStr.length() - 1; i >= 0; i--) {
                if (factStr.charAt(i) == '0') {
                    trailing++;
                } else {
                    break;
                }
            }
            System.out.println("Verification: " + n + "! = " + factorial);
            System.out.println("Actual trailing zeros: " + trailing);
        }
    }
}