package Ques_91_to_100;

import java.util.HashMap;

// Calculate Word Frequency in a Sentence

public class ques95 {
    public static void main(String[] args) {
        String sentence = "hello world hello java world";
        String[] words = sentence.split(" ");
        HashMap<String, Integer> frequency = new HashMap<>();
        
        for(String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Word frequencies: " + frequency);
    }
}
