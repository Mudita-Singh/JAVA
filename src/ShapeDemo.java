// Abstract class Shape with an abstract method calculateArea()
abstract class Shape {
    abstract void calculateArea(); // Abstract method
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length, width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing calculateArea() for Rectangle
    void calculateArea() {
        double area = length * width;
        System.out.println("Rectangle Area: " + area);
    }
}

// Circle class extending Shape
class Circlle extends Shape {
    private double radius;

    // Constructor
    Circlle(double radius) {
        this.radius = radius;
    }

    // Implementing calculateArea() for Circle
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle Area: " + area);
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10); // Rectangle object
        Shape circlle = new Circlle(7); // Circle object

        rectangle.calculateArea(); // Calls overridden method in Rectangle
        circlle.calculateArea(); // Calls overridden method in Circle
    }
}
