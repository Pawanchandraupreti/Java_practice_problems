package Ques1_to_20;

//Remove Duplicates from Sorted Array

public class ques13 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println("New length: " + (j + 1));
    }
}
