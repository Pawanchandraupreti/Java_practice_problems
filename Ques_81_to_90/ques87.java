package Ques_81_to_90;

// Pattern Matching for Switch (Java 17+)

public class ques87 {
    public static String format(Object obj) {
        return switch (obj) {
            case Integer i -> String.format("int %d", i);
            case String s -> String.format("String %s", s);
            case null -> "null";
            default -> obj.toString();
        };
    }

    public static void main(String[] args) {
        System.out.println(format(42));      // int 42
        System.out.println(format("Hello")); // String Hello
    }
}
