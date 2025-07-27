package Ques_41_to_50;

import java.util.Arrays;
import java.util.Comparator;

// Custom Comparator


public class ques49 {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        
        Arrays.sort(names, new Comparator<String>() {
            public int compare(String a, String b) {
                return b.length() - a.length(); // Sort by length descending
            }
        });
        
        System.out.println("Sorted names: " + Arrays.toString(names));
    }
}
