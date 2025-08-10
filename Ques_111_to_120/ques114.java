package Ques_111_to_120;

// Count Word Lengths in Sentence

public class ques114 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps";
        String[] words = sentence.split(" ");
        int[] counts = new int[10]; // tracks words of length 1-9
        
        for (String word : words) {
            int len = word.length();
            if (len < counts.length) counts[len]++;
        }
        
        for (int i = 1; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println(counts[i] + " word(s) with " + i + " letters");
            }
        }
    }
}
