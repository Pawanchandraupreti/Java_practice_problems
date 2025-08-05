package Ques_91_to_100;

// Count Vowels in a String

public class ques91 {
    public static void main(String[] args) {
        String text = "Hello World";
        int vowelCount = 0;
        
        for(char c : text.toLowerCase().toCharArray()) {
            if("aeiou".indexOf(c) != -1) {
                vowelCount++;
            }
        }
        
        System.out.println("Vowel count: " + vowelCount); // Output: 3
    }
}
