// Calculate the Sum of Natural Numbers Using Formula
public class ques274 {
    public static void main(String[] args) {
        int n = 10;
        int sum = n * (n + 1) / 2;
        
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
        
        // Verification
        int verifySum = 0;
        for (int i = 1; i <= n; i++) {
            verifySum += i;
        }
        System.out.println("Verified sum: " + verifySum);
    }
}

