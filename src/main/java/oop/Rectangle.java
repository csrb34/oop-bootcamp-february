package oop;

public class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    // Could be in an abstract "Shape" class
    public int getArea() {
        return width * height;
    }

    // Could be in an abstract "Shape" class
    public int getPerimeter() {
        return 2 * (width + height);
    }
}
