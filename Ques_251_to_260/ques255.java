package Ques_251_to_260;

import java.util.HashMap;
import java.util.Scanner;

// Create a Simple Text-Based Morse Code Translator

public class ques255 {
    public static void main(String[] args) {
        HashMap<Character, String> morseCode = new HashMap<>();
        morseCode.put('A', ".-"); morseCode.put('B', "-..."); morseCode.put('C', "-.-.");
        morseCode.put('D', "-.."); morseCode.put('E', "."); morseCode.put('F', "..-.");
        morseCode.put('G', "--."); morseCode.put('H', "...."); morseCode.put('I', "..");
        morseCode.put('J', ".---"); morseCode.put('K', "-.-"); morseCode.put('L', ".-..");
        morseCode.put('M', "--"); morseCode.put('N', "-."); morseCode.put('O', "---");
        morseCode.put('P', ".--."); morseCode.put('Q', "--.-"); morseCode.put('R', ".-.");
        morseCode.put('S', "..."); morseCode.put('T', "-"); morseCode.put('U', "..-");
        morseCode.put('V', "...-"); morseCode.put('W', ".--"); morseCode.put('X', "-..-");
        morseCode.put('Y', "-.--"); morseCode.put('Z', "--..");
        morseCode.put('1', ".----"); morseCode.put('2', "..---"); morseCode.put('3', "...--");
        morseCode.put('4', "....-"); morseCode.put('5', "....."); morseCode.put('6', "-....");
        morseCode.put('7', "--..."); morseCode.put('8', "---.."); morseCode.put('9', "----.");
        morseCode.put('0', "-----");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to translate to Morse code: ");
        String text = scanner.nextLine().toUpperCase();
        
        StringBuilder morse = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c == ' ') {
                morse.append(" / ");
            } else if (morseCode.containsKey(c)) {
                morse.append(morseCode.get(c)).append(" ");
            }
        }
        
        System.out.println("Morse code: " + morse.toString().trim());
    }
}



