package Ques_81_to_90;

import java.util.concurrent.Executors;

// Virtual Threads (Java 21+)

public class ques88 {
    public class VirtualThreadDemo {
    public static void main(String[] args) {
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            for (int i = 0; i < 10; i++) {
                int taskId = i;
                executor.submit(() -> {
                    Thread.sleep(100);
                    System.out.println("Task " + taskId + " executed by " + Thread.currentThread());
                    return null;
                });
            }
        }
    }

    }
}
