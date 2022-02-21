package oop;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Dimensions cannot be negative");
        }
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return width * height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }
}
