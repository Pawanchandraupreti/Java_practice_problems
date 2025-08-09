package Ques_101_to_110;

// Anagram Checker (Case-Insensitive)

public class ques106 {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";
        
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();
        
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);


        
        boolean isAnagram = java.util.Arrays.equals(arr1, arr2);
        System.out.println("Are anagrams? " + isAnagram);
    }
}
