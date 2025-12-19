
// Generate a Word Ladder with Reverse
public class ques271 {
    public static void main(String[] args) {
        String word = "LADDER";
        
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(0, i + 1) + 
                             new StringBuilder(word.substring(0, i + 1)).reverse());
        }
    }
}
