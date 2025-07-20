package Ques_11_to_20;

//Reverse a number using recursion without converting to String.

public class ques18 {
    static int reversed = 0;
    
    public static int reverse(int num) {
        if (num == 0) return reversed;
        reversed = reversed * 10 + num % 10;
        return reverse(num / 10);
    }
    
    public static void main(String[] args) {
        System.out.println(reverse(1234)); // Output: 4321
    }
}
