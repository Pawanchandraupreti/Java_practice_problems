package Ques_21_to_30;

import java.util.Arrays;
import java.util.List;

//Sort a list of strings by length using lambda expressions

public class ques26 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Charlie");
        names.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(names);
    }
}
