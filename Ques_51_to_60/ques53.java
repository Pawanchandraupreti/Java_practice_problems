package Ques_51_to_60;

//Simple Unit Testing (Without Framework)

class MathUtils {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class ques53 {
    public static void main(String[] args) {
        testMultiplication();
    }
    
    static void testMultiplication() {
        int result = MathUtils.multiply(3, 4);
        if (result != 12) {
            throw new AssertionError("Test failed: 3 * 4 should be 12");
        }
        System.out.println("Multiplication test passed!");
    }
}
