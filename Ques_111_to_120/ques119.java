package Ques_111_to_120;

import java.util.Arrays;
import java.util.List;

// Find Longest String in List

public class ques119 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript", "C++");
        
        String longest = words.stream()
                            .reduce("", (a, b) -> a.length() > b.length() ? a : b);
        
        System.out.println("Longest word: " + longest);
    }
}
