package Ques_51_to_60;

//Stack Using Array

class ArrayStack {
    private int[] stack;
    private int top;
    
    ArrayStack(int size) {
        stack = new int[size];
        top = -1;
    }
    
    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        stack[++top] = value;
    }
    
    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stack[top--];
    }
}

public class ques57 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(3);
        stack.push(10);
        stack.push(20);
        System.out.println("Popped: " + stack.pop());
    }
}
