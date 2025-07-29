package Ques_51_to_60;

import java.util.Stack;

// String Reversal Using Stack

public class ques58 {
    public static String reverse(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }
}
