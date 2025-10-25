// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Normal method
    void display() {
        System.out.println("Displaying the shape");
    }
}

// Concrete subclass
class Circle extends Shape {
    // Providing implementation for abstract method
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Shape s = new Circle();  // Upcasting
        s.draw();                // Output: Drawing a circle
        s.display();             // Output: Displaying the shape
    }
}
