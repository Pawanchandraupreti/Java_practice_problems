package Ques_141_to_150;

//  Calculate Look-and-Say Sequence

public class ques147 {
    public static void main(String[] args) {
        String current = "1";
        System.out.println(current);
        
        for (int i = 0; i < 6; i++) {
            current = generateNext(current);
            System.out.println(current);
        }
    }
    
    static String generateNext(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            } else {
                result.append(count).append(s.charAt(i-1));
                count = 1;
            }
        }
        result.append(count).append(s.charAt(s.length()-1));
        return result.toString();
    }
}
