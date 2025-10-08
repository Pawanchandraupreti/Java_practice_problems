package Ques_221_to_230;

// Create a Simple Text-Based Number Base Converter

public class ques229 {
    public static void main(String[] args) {
        int decimalNumber = 42;
        
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + Integer.toBinaryString(decimalNumber));
        System.out.println("Octal: " + Integer.toOctalString(decimalNumber));
        System.out.println("Hexadecimal: " + Integer.toHexString(decimalNumber).toUpperCase());
    }
}
