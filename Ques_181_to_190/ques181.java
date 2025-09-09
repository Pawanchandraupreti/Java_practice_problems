package Ques_181_to_190;

//Generate a Word Ladder Pattern

public class ques181 {
    public static void main(String[] args) {
        String word = "LADDER";
        

        
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.substring(i) + word.substring(0, i));
        }
    }
}
