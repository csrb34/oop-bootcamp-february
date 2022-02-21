package oop;

public class Rectagle {
    public Double height;
    public Double width;
    public String color;

    public Rectagle(Double height, Double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public Double getArea() {
        return this.height*this.width;
    }
}
