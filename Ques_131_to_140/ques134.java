package Ques_131_to_140;

// Generate a QR Code (ASCII Art)

public class ques134 {
    public static void main(String[] args) {
        String url = "https://java.com";
        int size = 21; // Simplified QR size
        
        System.out.println("Scan this QR code:");
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                // Simplified pattern - real QR would use error correction
                boolean isBlack = (x + y) % 3 == 0 || 
                                 (x * y) % 5 == 0 || 
                                 x == y || 
                                 x + y == size - 1;
                System.out.print(isBlack ? "██" : "  ");
            }
            System.out.println();
        }
        System.out.println("Links to: " + url);
    }
}
