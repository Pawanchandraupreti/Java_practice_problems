package Ques_41_to_50;

import java.util.HashMap;

//HashMap Usage

public class ques47 {
    public static void main(String[] args) {
        HashMap<String, Integer> ageMap = new HashMap<>();
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        
        System.out.println("Alice's age: " + ageMap.get("Alice"));
        ageMap.forEach((name, age) -> 
            System.out.println(name + " is " + age + " years old"));
    }
}
