package Ques_131_to_140;

// Simulate a Bouncing Ball Animation

public class ques139 {
    public static void main(String[] args) throws InterruptedException {
        int height = 10;
        int pos = 0;
        int direction = 1;
        
        while (true) {
            System.out.print("\033[H\033[2J"); // Clear console
            System.out.flush();
            
            System.out.println(" ".repeat(pos) + "o");
            System.out.println("=".repeat(height));
            
            pos += direction;
            if (pos <= 0 || pos >= height-1) direction *= -1;
            
            Thread.sleep(200);
        }
    }
}
