package Ques_101_to_110;

// Perfect Number Checker

public class ques107 {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;
        
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        System.out.println(num + " is " + (sum == num ? "" : "not ") + "perfect");
    }
}
