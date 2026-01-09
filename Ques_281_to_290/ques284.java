package Ques_281_to_290;

// Calculate the Number of Digits in Factorial

public class ques284 {
    public static void main(String[] args) {
        int n = 10;
        double logSum = 0;
        
        // Using logarithms to avoid huge numbers
        for (int i = 1; i <= n; i++) {
            logSum += Math.log10(i);
        }
        
        int digitCount = (int)Math.floor(logSum) + 1;
        System.out.println(n + "! has " + digitCount + " digits");
        
        // Verification for small n
        if (n <= 20) {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(n + "! = " + factorial);
            System.out.println("Actual digit count: " + String.valueOf(factorial).length());
        }
    }
}

