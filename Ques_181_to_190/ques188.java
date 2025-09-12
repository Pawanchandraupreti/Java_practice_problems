package Ques_181_to_190;

// Calculate the Digital Product of a Number

public class ques188 {
    public static void main(String[] args) {
        
        int number = 234;
        int product = 1;
        
        while (number > 0) {
            product *= number % 10;
            number /= 10;
            
        }
        
        System.out.println("Digital product: " + product);
    }
}
