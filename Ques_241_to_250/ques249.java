package Ques_241_to_250;

import java.util.Scanner;

// Create a Simple Text-Based Palindrome Checker

public class ques249 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        
        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println(word + " is " + (isPalindrome ? "" : "not ") + "a palindrome");
    }
}
