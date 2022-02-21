package oop;

public class Rectangle {
    private final Double height;
    private final Double width;
    private final String color;

    public Rectangle(Double height, Double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public Double calculateArea() {
        return this.height * this.width;
    }

    public Double calculatePerimeter() {
        return 2 * (this.height + this.width);
    }
}
