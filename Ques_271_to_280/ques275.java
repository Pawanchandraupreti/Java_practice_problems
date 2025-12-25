// Create a Simple Text-Based Random Sentence Generator

import java.util.Random;

public class ques275 {
     public static void main(String[] args) {
        Random rand = new Random();
        String[] subjects = {"The cat", "A dog", "My friend", "The teacher", "A programmer"};
        String[] verbs = {"runs", "jumps", "codes", "learns", "teaches"};
        String[] objects = {"quickly", "in Java", "every day", "with joy", "at school"};
        
        String sentence = subjects[rand.nextInt(subjects.length)] + " " +
                         verbs[rand.nextInt(verbs.length)] + " " +
                         objects[rand.nextInt(objects.length)] + ".";
        
        System.out.println("Generated sentence: " + sentence);
    }
}

