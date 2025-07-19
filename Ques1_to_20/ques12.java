package Ques1_to_20;

import java.util.Arrays;

//Check if Two Strings are Anagrams

public class ques12 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1, arr2);
        System.out.println("Anagram? " + isAnagram);
    }
}
