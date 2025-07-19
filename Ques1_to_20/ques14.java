package Ques1_to_20;

//Binary Search on Sorted Array

public class ques14 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};
        int target = 16;
        int left = 0, right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Found? " + found);
    }
}
