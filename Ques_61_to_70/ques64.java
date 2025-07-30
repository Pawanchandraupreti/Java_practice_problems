package Ques_61_to_70;

// Record Type (Java 16+)

record Point(int x, int y) {
    public double distanceFromOrigin() {
        return Math.sqrt(x*x + y*y);
    }
}

public class ques64 {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println(p); // Point[x=3, y=4]
        System.out.println("Distance: " + p.distanceFromOrigin());
    }
}
