package Ques_61_to_70;

import java.util.Optional;

// Optional Class (Null Safety)

public class ques63 {
    public static Optional<String> findUser(int id) {
        return (id == 1) ? Optional.of("Alice") : Optional.empty();
    }
    
    public static void main(String[] args) {
        Optional<String> user = findUser(1);
        System.out.println(user.orElse("Unknown")); // Alice
        
        findUser(2).ifPresentOrElse(
            name -> System.out.println("Found: " + name),
            () -> System.out.println("Not found")
        );
    }
}
