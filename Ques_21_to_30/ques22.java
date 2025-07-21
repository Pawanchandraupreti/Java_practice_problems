package Ques_21_to_30;

//Print all prime numbers between 1 and 100 using the Sieve of Eratosthenes.

public class ques22 {
    public static void main(String[] args) {
        boolean[] primes = new boolean[101];
        for (int i = 2; i <= 100; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p <= 100; p++) {
            if (primes[p]) {
                for (int i = p * p; i <= 100; i += p) {
                    primes[i] = false;
                }
            }
        }

        for (int i = 2; i <= 100; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
