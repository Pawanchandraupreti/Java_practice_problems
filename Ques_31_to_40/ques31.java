package Ques_31_to_40;

//Enhanced Calculator with Methods



public class ques31 {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { 
        if (b == 0) throw new ArithmeticException("Cannot divide by zero!");
        return a / b; 
    }

    public static void main(String[] args) {
        System.out.println("5 + 3 = " + add(5, 3));
        System.out.println("10 / 2 = " + divide(10, 2));
    }
}
