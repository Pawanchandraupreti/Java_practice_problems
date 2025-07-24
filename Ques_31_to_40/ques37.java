package Ques_31_to_40;

//Constructor Overloading

class Student {
    String name;
    int age;
    String department;
    
    Student(String n, int a) {
        name = n;
        age = a;
        department = "Undeclared";
    }
    
    Student(String n, int a, String d) {
        name = n;
        age = a;
        department = d;
    }
    
    void display() {
        System.out.println(name + ", " + age + ", " + department);
    }
}

public class ques37 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 21, "Computer Science");
        s1.display();
        s2.display();
    }
}
