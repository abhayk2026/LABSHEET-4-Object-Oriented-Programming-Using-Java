class Shape {
    void displayType() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Q14_ShapeHierarchy {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        rectangle.displayType();
        System.out.printf("Rectangle Area: %.2f%n", rectangle.calculateArea());
        circle.displayType();
        System.out.printf("Circle Area: %.2f%n", circle.calculateArea());
    }
}
