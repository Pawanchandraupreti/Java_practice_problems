package Ques_91_to_100;

// Reverse an Array

public class ques92 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        System.out.print("Original: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
        
        // Reverse logic
        for(int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        
        System.out.print("\nReversed: ");
        for(int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
