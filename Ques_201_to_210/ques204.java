package Ques_201_to_210;

// Calculate the Product of Digits in a Number

public class ques204 {
    public static void main(String[] args) {
        int number = 2345;
        int product = 1;
        
        
        while (number > 0) {
            product *= number % 10;
            number /= 10;
        }
        
        System.out.println("Product of digits: " + product);
    }
}
