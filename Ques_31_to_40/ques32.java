package Ques_31_to_40;

//Array Utilities (Min/Max/Avg)

public class ques32 {
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static double calculateAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5};
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Average: " + calculateAverage(numbers));
    }
}
