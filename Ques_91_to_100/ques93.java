package Ques_91_to_100;

// Check if String is Palindrome

public class ques93 {
    public static void main(String[] args) {
        String word = "racecar";
        boolean isPalindrome = true;
        
        for(int i = 0; i < word.length() / 2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        System.out.println(word + " is palindrome? " + isPalindrome);
    }
}
