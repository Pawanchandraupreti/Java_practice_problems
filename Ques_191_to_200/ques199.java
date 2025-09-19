package Ques_191_to_200;

// Generate a Pattern of Numbers in a Square

public class ques199 {
    public static void main(String[] args) {
        int size = 4;
        int count = 1;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%3d", count++);
            }
            
            
            System.out.println();
        }
    }
}
