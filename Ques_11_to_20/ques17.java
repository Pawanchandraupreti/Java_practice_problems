package Ques_11_to_20;

//Implement the Singleton design pattern in Java.

public class ques17 {
    private static ques17 instance;
    private String value;
    
    private ques17(String value) {
        this.value = value;
    }
    
    public static ques17 getInstance(String value) {
        if (instance == null) {
            instance = new ques17(value);
        }
        return instance;
    }
    
    public String getValue() {
        return value;
    }

    public static void main(String[] args) {
        ques17 singleton1 = ques17.getInstance("First");
        ques17 singleton2 = ques17.getInstance("Second");
        
        System.out.println(singleton1.getValue());
        System.out.println(singleton2.getValue());
        System.out.println(singleton1 == singleton2);
    }
}
