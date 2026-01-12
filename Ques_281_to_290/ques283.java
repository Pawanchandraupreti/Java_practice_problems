package Ques_281_to_290;

// Generate a Pattern of Numbers in a Pyramid of Pyramids

public class ques283 {
    public static void main(String[] args) {
        int mainPyramidHeight = 3;
        
        for (int pyramid = 1; pyramid <= mainPyramidHeight; pyramid++) {
            for (int i = 1; i <= pyramid; i++) {
                System.out.print(" ".repeat(mainPyramidHeight - i));
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

