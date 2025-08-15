package Ques_131_to_140;

// Generate a Simple Barcode

public class ques140 {
    public static void main(String[] args) {
        String number = "12345";
        System.out.println("╔" + "═".repeat(number.length()*6) + "╗");
        
        for (char c : number.toCharArray()) {
            int digit = Character.getNumericValue(c);
            String binary = String.format("%4s", 
                Integer.toBinaryString(digit)).replace(' ', '0');
            System.out.println("║" + binary.replace("0", " ").replace("1", "█") + "║");
        }
        
        System.out.println("╚" + "═".repeat(number.length()*6) + "╝");
        System.out.println(" " + number.replace("", "   ").trim());
    }
}
