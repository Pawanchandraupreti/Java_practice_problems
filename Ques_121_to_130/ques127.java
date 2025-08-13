package Ques_121_to_130;

import java.util.Map;

// Convert Roman Numerals to Integers

public class ques127 {
    public static void main(String[] args) {
        String roman = "XIV";
        Map<Character, Integer> values = Map.of(
            'I', 1, 'V', 5, 'X', 10,
            'L', 50, 'C', 100, 'D', 500, 'M', 1000
        );
        
        int total = 0;
        for (int i = 0; i < roman.length(); i++) {
            int current = values.get(roman.charAt(i));
            int next = i < roman.length() - 1 ? values.get(roman.charAt(i + 1)) : 0;
            total += (current < next) ? -current : current;
        }
        
        System.out.println(roman + " = " + total);
    }
}
