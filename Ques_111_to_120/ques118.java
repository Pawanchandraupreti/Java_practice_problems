package Ques_111_to_120;

import java.util.ArrayList;

// Convert ArrayList to Array

public class ques118 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple"); fruits.add("Banana"); fruits.add("Mango");
        
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println(java.util.Arrays.toString(fruitArray));
    }
}
