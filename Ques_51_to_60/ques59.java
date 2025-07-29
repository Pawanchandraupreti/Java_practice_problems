package Ques_51_to_60;

// Prime Number Check (Optimized)

public class ques59 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is 17 prime? " + isPrime(17));
        System.out.println("Is 15 prime? " + isPrime(15));
    }
}
