package Ques_71_to_80;

import java.util.concurrent.CompletableFuture;

// CompletableFuture Chaining

public class ques72 {
    public static void main(String[] args) throws Exception {
        CompletableFuture.supplyAsync(() -> "Hello")
            .thenApply(s -> s + " World")
            .thenAccept(System.out::println)
            .get();
    }
}
