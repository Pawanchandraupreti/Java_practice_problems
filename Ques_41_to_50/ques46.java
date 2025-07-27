package Ques_41_to_50;

import java.util.ArrayList;

// ArrayList Basics

public class ques46 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add(1, "Mango");
        
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("All fruits: " + fruits);
    }
}
