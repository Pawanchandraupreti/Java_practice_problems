package Ques_281_to_290;

// Generate a Pattern of Prime Numbers in a Right Triangle

public class ques290 {
    public static void main(String[] args) {
        int rows = 5;
        int current = 2;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                while (!isPrime(current)) {
                    current++;
                }
                System.out.printf("%4d", current);
                current++;
            }
            System.out.println();
        }
    }
    
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
