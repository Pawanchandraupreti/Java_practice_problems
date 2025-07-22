package Ques_21_to_30;

import java.util.Arrays;
import java.util.List;

//Use Java Streams to filter and process a list

public class ques27 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> n * n)
               .forEach(System.out::println);
    }
}
