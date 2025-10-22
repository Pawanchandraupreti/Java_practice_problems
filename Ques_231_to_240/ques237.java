package Ques_231_to_240;

// Generate a Pattern of Numbers in a Circular Spiral

public class ques237 {
    public static void main(String[] args) {
        int n = 4;
        int[][] spiral = new int[2*n-1][2*n-1];
        int value = 1;
        
        for (int layer = 0; layer < n; layer++) {
            // Top row
            for (int i = layer; i < 2*n-1-layer; i++) {
                spiral[layer][i] = value++;
            }
            // Right column
            for (int i = layer+1; i < 2*n-1-layer; i++) {
                spiral[i][2*n-2-layer] = value++;
            }
            // Bottom row
            for (int i = 2*n-3-layer; i >= layer; i--) {
                spiral[2*n-2-layer][i] = value++;
            }
            // Left column
            for (int i = 2*n-3-layer; i > layer; i--) {
                spiral[i][layer] = value++;
            }
        }
        
        
        
        // Print spiral
        for (int[] row : spiral) {
            for (int num : row) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }
    }
}
