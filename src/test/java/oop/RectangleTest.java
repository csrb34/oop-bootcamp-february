package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleTest {

    @Test
    public void testGetArea() {
        var rectangle = new Rectangle(5,10);
        assertEquals(rectangle.getArea(),50);
    }

    @Test
    public void testGetPerimeter() {
        var rectangle = new Rectangle(5,10);

        assertEquals(rectangle.getPerimeter(),30);
    }
}