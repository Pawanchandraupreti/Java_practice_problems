package Ques_171_to_180;

// Create a Prime Number Checker

public class ques172 {
    public static void main(String[] args) {
        int number = 29;
        boolean isPrime = true;
        
        if (number <= 1) {
            isPrime = false;
            
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        System.out.println(number + " is " + (isPrime ? "prime" : "not prime"));
    }
}
