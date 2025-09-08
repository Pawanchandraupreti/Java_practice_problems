package Ques_181_to_190;

// Calculate the LCM of Two Numbers

public class ques183 {
    public static void main(String[] args) {
        int a = 12, b = 18;
        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
    
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
