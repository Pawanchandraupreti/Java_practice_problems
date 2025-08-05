package Ques_91_to_100;

// Find Common Elements in Two Arrays

public class ques94 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        
        System.out.print("Common elements: ");
        for(int num1 : arr1) {
            for(int num2 : arr2) {
                if(num1 == num2) {
                    System.out.print(num1 + " ");
                    break;
                }
            }
        }
    }
}
