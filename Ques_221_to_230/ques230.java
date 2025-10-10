package Ques_221_to_230;

// Generate a Pattern of Prime Numbers

public class ques230 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        int rows = 4;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                while (!isPrime(num)) {
                    num++;
                }
                System.out.printf("%3d", num);
                num++;
                count++;
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
