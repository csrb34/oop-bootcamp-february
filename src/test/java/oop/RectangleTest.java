package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void itShouldCalculateTheArea() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);

        assertEquals(rectangle.calculateArea(), 6.0);
    }

    @Test
    public void itShouldCalculateThePerimeter() {
        Rectangle rectangle = new Rectangle(2.0, 3.0);

        assertEquals(rectangle.calculatePerimeter(), 10.0);
    }
}
