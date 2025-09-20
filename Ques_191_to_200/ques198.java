package Ques_191_to_200;

// Calculate the Sum of Even Numbers in an Array

public class ques198 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                
                sum += num;
            }
        }
        
        System.out.println("Sum of even numbers: " + sum);
    }
}
