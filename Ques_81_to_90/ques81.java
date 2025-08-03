package Ques_81_to_90;

// PriorityQueue for Task Scheduling

import java.util.*;

class Task implements Comparable<Task> {
    String name;
    int priority;
    
    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    
    public int compareTo(Task other) {
        return Integer.compare(other.priority, this.priority); // Higher priority first
    }
}

public class ques81 {
    public static void main(String[] args) {
        PriorityQueue<Task> queue = new PriorityQueue<>();
        queue.add(new Task("System Backup", 3));
        queue.add(new Task("User Request", 1));
        queue.add(new Task("Critical Update", 5));
        
        while (!queue.isEmpty()) {
            Task task = queue.poll();
            System.out.println("Processing: " + task.name + " (Priority: " + task.priority + ")");
        }
    }
}
