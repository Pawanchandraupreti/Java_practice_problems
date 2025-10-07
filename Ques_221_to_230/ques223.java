package Ques_221_to_230;

// Generate a Pattern of Numbers in a Hollow Square

public class ques223 {
    public static void main(String[] args) {
        int size = 5;
        int count = 1;
        
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.printf("%2d", count++);
                } else {
                    System.out.print("  ");
                    count++;
                }
            }
            System.out.println();
            
        }
    }
}
