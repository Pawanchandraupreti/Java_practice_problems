package Ques_111_to_120;

// Remove Duplicates from ArrayList

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ques116 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1); numbers.add(2); numbers.add(1); numbers.add(3);
        
        LinkedHashSet<Integer> unique = new LinkedHashSet<>(numbers);
        System.out.println("Unique numbers: " + unique);
    }
}
