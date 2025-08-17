package Ques_141_to_150;

import java.util.Arrays;

// Create a Word Unscrambler

public class ques142 {
    public static void main(String[] args) {
        String[] dictionary = {"listen", "silent", "enlist", "banana", "train"};
        String scrambled = "silent";
        
        System.out.println("Possible words:");
        for (String word : dictionary) {
            if (sortString(word).equals(sortString(scrambled))) {
                System.out.println(word);
            }
        }
    }
    
    private static String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
