package Ques_101_to_110;

//  Print Floyd's Triangle

public class ques110 {
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}
