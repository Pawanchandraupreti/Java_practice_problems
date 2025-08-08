package Ques_101_to_110;

// Decimal to Binary Converter

public class ques109 {
    public static void main(String[] args) {
        int decimal = 18;
        StringBuilder binary = new StringBuilder();
        
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        
        System.out.println("Binary: " + binary);
    }
}
