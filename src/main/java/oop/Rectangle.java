package oop;

public class Rectangle {
    private final double height;
    private final double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculatePerimeter() {
        return 2 * (height + width);
    }
}
