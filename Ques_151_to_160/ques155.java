package Ques_151_to_160;

// Create a Simple Text Encryption (Reverse Cipher)

public class ques155 {
    public static void main(String[] args) {
        String message = "Hello World!";
        StringBuilder encrypted = new StringBuilder(message).reverse();
        
        System.out.println("Original: " + message);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + encrypted.reverse());
    }
}
