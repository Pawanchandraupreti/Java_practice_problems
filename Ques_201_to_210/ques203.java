package Ques_201_to_210;

// Generate a Pattern of Repeating Characters

public class ques203 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
