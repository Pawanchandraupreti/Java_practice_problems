package Ques_21_to_30;

//Count how many times a word appears in a text file.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ques24 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
        String line;
        Map<String, Integer> wordCount = new HashMap<>();
        String targetWord = "Java";

        while ((line = reader.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(targetWord)) {
                    wordCount.put(targetWord, wordCount.getOrDefault(targetWord, 0) + 1);
                }
            }
        }
        reader.close();

        System.out.println(targetWord + " appears " + wordCount.getOrDefault(targetWord, 0) + " times");
    }
}
