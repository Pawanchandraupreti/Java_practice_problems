package Ques_261_to_270;

// Find the Maximum Product of Two Numbers in an Array

public class ques266 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 2, 6, 4};
        int maxProduct = Integer.MIN_VALUE;
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int product = numbers[i] * numbers[j];
                if (product > maxProduct) {
                    maxProduct = product;
                }
            }
        }
        
        System.out.println("Maximum product of two numbers: " + maxProduct);
    }
}


