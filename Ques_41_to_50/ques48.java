package Ques_41_to_50;

//Generic Method

public class ques48 {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"Hello", "World"};
        
        printArray(intArray);
        printArray(strArray);
    }
}
