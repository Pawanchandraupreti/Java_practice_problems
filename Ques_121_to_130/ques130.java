package Ques_121_to_130;

import java.util.HashMap;
import java.util.Map;

// Generate Morse Code Translator

public class ques130 {
    public static void main(String[] args) {
        Map<Character, String> morseCode = new HashMap<>();
        morseCode.put('A', ".-"); morseCode.put('B', "-...");
        morseCode.put('C', "-.-."); morseCode.put('D', "-..");
        // Add more letters as needed...
        
        String text = "SOS";
        text = text.toUpperCase();
        
        StringBuilder morse = new StringBuilder();
        for (char c : text.toCharArray()) {
            morse.append(morseCode.getOrDefault(c, " ")).append(" ");
        }
        
        System.out.println(text + " in Morse: " + morse);
    }
}
