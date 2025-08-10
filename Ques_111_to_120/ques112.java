package Ques_111_to_120;

// Check Balanced Parentheses

public class ques112 {
    public static void main(String[] args) {
        String expr = "((a+b)*(c-d))";
        int balance = 0;
        
        for (char c : expr.toCharArray()) {
            if (c == '(') balance++;
            else if (c == ')') balance--;
            
            if (balance < 0) break;
        }
        
        System.out.println("Parentheses are " + (balance == 0 ? "balanced" : "unbalanced"));
    }
}
