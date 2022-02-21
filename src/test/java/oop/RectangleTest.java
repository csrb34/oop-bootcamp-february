package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void shouldCalculatePerimeter() {
        var rectangle = new Rectangle(5, 10);

        assertEquals(rectangle.calculatePerimeter(), 30);
    }
}