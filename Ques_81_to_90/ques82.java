package Ques_81_to_90;

import java.util.Arrays;

// Merge Sort Implementation

public class ques82 {
    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            
            mergeSort(left);
            mergeSort(right);
            
            merge(arr, left, right);
        }
    }
    
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        System.arraycopy(left, i, arr, k, left.length - i);
        System.arraycopy(right, j, arr, k, right.length - j);
    }

    public static void main(String[] args) {
        int[] nums = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(nums);
        System.out.println("Sorted: " + Arrays.toString(nums));
    }
}
