package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class RectangleTest {

    @Test
    public void shouldCalculateArea() {
        var rectangle = new Rectangle(5, 10);

        assertEquals(rectangle.calculateArea(), 50);
    }

    @Test
    public void shouldCalculatePerimeter() {
        var rectangle = new Rectangle(5, 10);

        assertEquals(rectangle.calculatePerimeter(), 30);
    }

    @Test
    public void itShouldNotAcceptNegativeWidth() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-5, 10));

    }

    @Test
    public void itShouldNotAcceptNegativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(5, -10));
    }
}
