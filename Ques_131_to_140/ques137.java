package Ques_131_to_140;

// Calculate ISBN-10 Checksum

public class ques137 {
    public static void main(String[] args) {
        String isbn = "030640615";
        int sum = 0;
        
        for (int i = 0; i < 9; i++) {
            sum += (i+1) * Character.getNumericValue(isbn.charAt(i));
        }   
        char checksum = (sum % 11 == 10) ? 'X' : (char)(sum % 11 + '0');
        System.out.println("Complete ISBN: " + isbn + checksum);
    }
}
