package Ques_141_to_150;

// Generate a Fibonacci Word Sequence

public class ques146 {
    public static void main(String[] args) {
        String s0 = "0", s1 = "01";
        System.out.println(s0);
        System.out.println(s1);
        
        for (int i = 2; i <= 6; i++) {
            String next = s1 + s0;
            System.out.println(next);
            s0 = s1;
            s1 = next;
        }
    }
}
