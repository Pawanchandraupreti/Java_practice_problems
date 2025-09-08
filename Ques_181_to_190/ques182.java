package Ques_181_to_190;

// Create a Simple Text-Based Bar Chart

public class ques182 {
    public static void main(String[] args) {
        int[] values = {5, 3, 8, 2, 7};
        String[] labels = {"A", "B", "C", "D", "E"};
        
        int maxHeight = 10;
        int maxValue = java.util.Arrays.stream(values).max().getAsInt();
        
        for (int i = maxHeight; i >= 0; i--) {
            for (int value : values) {
                int barHeight = value * maxHeight / maxValue;
                System.out.print(barHeight >= i ? "██  " : "    ");
            }
            System.out.println();
        }
        
        for (String label : labels) {
            System.out.print(label + "  ");
        }
    }
}
