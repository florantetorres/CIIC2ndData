package Task15;

// Define the Shape interface
interface Shape {
    // Method to calculate the area of the shape
    double calculateArea();
    // Method to calculate the perimeter of the shape
    double calculatePerimeter();
}
// Create an abstract class AbstractShape that implements Shape
abstract class AbstractShape implements Shape {
    protected String color;
    protected double length;
    protected double width;
    // Constructor to initialize the color, length, and width of the shape
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
    // These methods will be overridden in the concrete classes
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
// Concrete class Circle
class Circle extends AbstractShape {
    private double radius;
    // Constructor to initialize the color and radius of the circle
    public Circle(String color, double radius) {
        super(color, 0, 0); // length and width are not needed for Circle
        this.radius = radius;
    }
    // Calculate the area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    // Calculate the perimeter of the circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
    // Method to display the details of the circle
    public void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
// Concrete class Rectangle
class Rectangle extends AbstractShape {
    // Constructor to initialize the color, length, and width of the rectangle
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }
    // Calculate the area of the rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
    // Calculate the perimeter of the rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    // Method to display the details of the rectangle
    public void displayDetails() {
        System.out.println("Rectangle Details:");
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
// Main class to test the shapes
class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        circle.displayDetails();
        System.out.println();
        Rectangle rectangle = new Rectangle("Blue", 4, 6);
        rectangle.displayDetails();
    }
}
