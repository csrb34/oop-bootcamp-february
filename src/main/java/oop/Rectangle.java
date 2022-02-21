package oop;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int calculatePerimeter() {
        return 2 * (width + height);
    }
}
