package Ques_21_to_30;

import java.lang.reflect.Method;

//Use reflection to inspect class methods

public class ques30 {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.util.ArrayList");
            Method[] methods = cls.getDeclaredMethods();
            
            System.out.println("ArrayList Methods:");
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
