package Ques_111_to_120;

import java.util.Random;

// Generate Random Array (No Duplicates)

public class ques113 {
    public static void main(String[] args) {
        int size = 10;
        int[] nums = new int[size];
        Random rand = new Random();
        
        for (int i = 0; i < size; i++) {
            int num;
            do {
                num = rand.nextInt(20) + 1;
            } while (contains(nums, num, i));
            nums[i] = num;
        }
        
        System.out.println(java.util.Arrays.toString(nums));
    }
    
    private static boolean contains(int[] arr, int num, int end) {
        for (int i = 0; i < end; i++) {
            if (arr[i] == num) return true;
        }
        return false;
    }
}
