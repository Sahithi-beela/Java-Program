import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Circle)) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.x, x) == 0 &&
               Double.compare(circle.y, y) == 0 &&
               Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, radius);
    }

    @Override
    public String toString() {
        return "Circle{" + "x=" + x + ", y=" + y + ", radius=" + radius + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        
        Set<Circle> hashSet = new HashSet<>();
        hashSet.add(new Circle(0, 0, 5));
        hashSet.add(new Circle(1, 1, 3));
        hashSet.add(new Circle(0, 0, 5)); 
        hashSet.add(new Circle(1, 1, 3)); 
        hashSet.add(new Circle(2, 2, 4));

        System.out.println("HashSet contains:");
        for (Circle circle : hashSet) {
            System.out.println(circle);
        }

        
        Set<Circle> treeSet = new TreeSet<>((c1, c2) -> {
            
            return Double.compare(c1.getRadius(), c2.getRadius());
        });

        treeSet.add(new Circle(0, 0, 5));
        treeSet.add(new Circle(1, 1, 3));
        treeSet.add(new Circle(0, 0, 5));
        treeSet.add(new Circle(1, 1, 3)); 
        treeSet.add(new Circle(2, 2, 4));

        System.out.println("\nTreeSet contains:");
        for (Circle circle : treeSet) {
            System.out.println(circle);
        }
    }
}

