class Rectangle {
    protected double length;
    protected double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }
} 
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
    public void display() {
        System.out.println("Square is a rectangle with all sides equal.");
    }
}
class Shape {
    public void display() {
        System.out.println("This is a shape.");
    }
}  
class RectangleShape extends Shape {
    @Override
    public void display() {
        System.out.println("This is a rectangular shape.");
    }
}
class CircleShape extends Shape {
    @Override
    public void display() {
        System.out.println("This is a circular shape.");
    }
}
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 5);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        Square square = new Square(5);
        System.out.println("Square Area: " + square.area());
        System.out.println("Square Perimeter: " + square.perimeter());
        System.out.println("\nArea of 10 squares:");
        for (int i = 1; i <= 10; i++) {
            Square temp = new Square(i);
            System.out.println("Side: " + i + ", Area: " + temp.area());
        }
        Shape shape = new Shape();
        shape.display();
        RectangleShape rectangleShape = new RectangleShape();
        rectangleShape.display();
        CircleShape circleShape = new CircleShape();
        circleShape.display();
        Square squareShape = new Square(5);
        squareShape.display();
    }
}
