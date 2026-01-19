package Ques_281_to_290;

// Find All Pairs in Array that Sum to a Target Value

public class ques286 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15, 3, 6, 8};
        int target = 10;
        
        System.out.println("Pairs that sum to " + target + ":");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println(numbers[i] + " + " + numbers[j] + " = " + target);
                }
            }
        }
    }
}


