package Ques_41_to_50;

//Binary Search Algorithm

public class ques50 {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56};
        int target = 16;
        System.out.println(target + " found at index: " + binarySearch(numbers, target));
    }
}
