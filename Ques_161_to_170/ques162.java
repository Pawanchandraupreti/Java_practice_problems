package Ques_161_to_170;

import java.util.HashMap;

// Create a Word Frequency Counter

public class ques162 {
    public static void main(String[] args) {
        String text = "hello world hello java world programming";
        String[] words = text.split(" ");
        HashMap<String, Integer> frequency = new HashMap<>();
        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        
        
        System.out.println("Word frequencies:");
        for (String word : frequency.keySet()) {
            System.out.println(word + ": " + frequency.get(word));
        }
    }
}
