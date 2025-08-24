package Ques_151_to_160;

// Create a Simple Text-Based Progress Bar

public class ques152 {
    public static void main(String[] args) throws InterruptedException {
        int total = 20;  
        for (int i = 0; i <= total; i++) {
            int percent = i * 100 / total;
            String bar = "[" + "=".repeat(i) + " ".repeat(total - i) + "]";
            System.out.printf("\r%d%% %s", percent, bar);
            Thread.sleep(200);
        }
        System.out.println("\nComplete!");
    }
}
