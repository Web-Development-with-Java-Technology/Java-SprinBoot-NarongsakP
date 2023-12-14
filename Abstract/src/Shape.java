
// supper class
abstract class Shape {
    // abstract method
    abstract void draw();

    // implementation method
    void display() {
        System.err.println("Displaying the shape.");
    }
}

// sub class
class Circle extends Shape {
    void draw() {
        System.err.println("Drawing a cirle.");
    }
}

// sub class
class Rectangle extends Shape {
    void draw() {
        System.err.println("Drawing a rectangle.");
    }
}

class Main {
    public static void main(String[] args) {
        // create object to class Circle
        Shape circle = new Circle();
        circle.draw(); // import abstract method
        circle.display(); // import implementation method

        // create object to class Rectangle
        Shape rectangle = new Rectangle();
        rectangle.draw();
        rectangle.display();
    }
}