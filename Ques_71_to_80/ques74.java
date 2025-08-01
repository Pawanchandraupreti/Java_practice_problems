package Ques_71_to_80;

import java.util.*;


// Method References

public class ques74 {
    public static void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }
    
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(ques74::printUpperCase);
    }
}
