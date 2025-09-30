package Ques_211_to_220;

import java.util.HashSet;
import java.util.Set;

// Find the Intersection of Two Arrays

public class ques216 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        Set<Integer> intersection = new HashSet<>();
        
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    intersection.add(num1);
                }
            }
        }
        
        
        System.out.println("Intersection: " + intersection);
    }
}
