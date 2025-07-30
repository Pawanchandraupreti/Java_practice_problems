package Ques_61_to_70;

// Pattern Matching for instanceof (Java 16+)

public class ques65 {
    public static void printLength(Object obj) {
        if (obj instanceof String s) { // Pattern variable s
            System.out.println("String length: " + s.length());
        } else if (obj instanceof Integer i) {
            System.out.println("Integer value: " + i);
        }
    }
    
    public static void main(String[] args) {
        printLength("hello");
        printLength(42);
    }
}
