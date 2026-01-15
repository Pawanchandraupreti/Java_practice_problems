package Ques_281_to_290;

import java.util.Scanner;

// Create a Simple Text-Based Palindrome Sentence Checker

public class ques289 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase().replaceAll("[^a-z]", "");
        
        boolean isPalindrome = true;
        for (int i = 0; i < sentence.length() / 2; i++) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println("The sentence is " + (isPalindrome ? "" : "not ") + "a palindrome");
    }
}


