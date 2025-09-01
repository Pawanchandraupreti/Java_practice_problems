package Ques_161_to_170;

// Create a Simple Text-Based Animation

public class ques164 {
    public static void main(String[] args) throws InterruptedException {
        String[] frames = {"-", "\\", "|", "/"};
        
        for (int i = 0; i < 20; i++) {
            System.out.print("\rLoading " + frames[i % frames.length]);
            Thread.sleep(200);
            
            
        }
        System.out.println("\rDone!          ");
    }
}
