package Ques_101_to_110;

// Find GCD of Two Numbers

public class ques104 {
    public static void main(String[] args) {
        int num1 = 54, num2 = 24;
        
        while (num1 != num2) {
            if (num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        
        System.out.println("GCD: " + num1);
    }
}
