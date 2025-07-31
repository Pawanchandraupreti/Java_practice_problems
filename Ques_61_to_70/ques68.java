package Ques_61_to_70;

import java.util.stream.IntStream;

// Parallel Stream Processing

public class ques68 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        
        IntStream.range(1, 100)
                 .parallel()
                 .mapToObj(i -> "Item " + i)
                 .forEach(System.out::println);
        
        System.out.println("Time: " + (System.currentTimeMillis() - start) + "ms");
    }
}
