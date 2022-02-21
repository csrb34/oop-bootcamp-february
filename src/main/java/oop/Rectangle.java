package oop;

public class Rectangle {
    public Double height;
    public Double width;
    public String color;

    public Rectangle(Double height, Double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public Double calculateArea() {
        return this.height*this.width;
    }
}
