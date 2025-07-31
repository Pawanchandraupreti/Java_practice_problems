package Ques_61_to_70;

// Try-With-Resources (AutoCloseable)

class Resource implements AutoCloseable {
    private String name;
    
    public Resource(String name) { 
        this.name = name;
        System.out.println("Created: " + name);
    }
    
    public void use() {
        System.out.println("Using: " + name);
    }
    
    public void close() {
        System.out.println("Closed: " + name);
    }
}

public class ques70 {
    public static void main(String[] args) {
        try (Resource r1 = new Resource("DB Connection");
             Resource r2 = new Resource("File Handle")) {
            r1.use();
            r2.use();
        }
}
}
