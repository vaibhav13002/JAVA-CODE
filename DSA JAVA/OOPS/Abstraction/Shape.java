package OOPS.Abstraction;

abstract class Shape {
    abstract double area();

    abstract double perimeter();
}

// Abstract subclass (inherits two abstract methods from Shape)
abstract class Rectangle extends Shape {
    protected double length;
    protected double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implements the area() method
    @Override
    double area() {
        return length * width;
    }

    // perimeter() method is still abstract
}

// Concrete subclass (provides implementation for the remaining abstract method)
class Square extends Rectangle {
    Square(double side) {
        super(side, side);
    }

    // Implements the perimeter() method
    @Override
    double perimeter() {
        return 4 * super.length;
    }

    public static void main(String[] args) {
        // Cannot create an instance of the abstract class Shape
        // Shape s = new Shape(); // Compiler error

        // Cannot create an instance of the abstract class Rectangle
        // Rectangle r = new Rectangle(3, 4); // Compiler error

        // Can create an instance of the concrete class Square
        Square sq = new Square(5);
        System.out.println("Area of the square: " + sq.area());
        System.out.println("Perimeter of the square: " + sq.perimeter());
    }
}
