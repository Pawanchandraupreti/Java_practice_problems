package Ques_31_to_40;

//Enhanced For-Loop Practice

public class ques35 {
    public static void printSquareNumbers(int[] nums) {
        for (int num : nums) {
            System.out.println(num + " squared is " + (num * num));
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        printSquareNumbers(numbers);
    }
}
