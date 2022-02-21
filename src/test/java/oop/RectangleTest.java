package oop;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class RectangleTest {

    public static final int WIDTH = 5;
    public static final int HEIGHT = 10;
    public static final int AREA = 50;
    public static final int PERIMETER = 30;
    private Rectangle rectangle;

    @BeforeTest
    public void setUp() {
        rectangle = new Rectangle(WIDTH, HEIGHT);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(rectangle.calculateArea(), AREA);
    }

    @Test
    public void shouldCalculatePerimeter() {
        assertEquals(rectangle.calculatePerimeter(), PERIMETER);
    }

    @Test
    public void itShouldNotAcceptNegativeWidth() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-WIDTH, HEIGHT));

    }

    @Test
    public void itShouldNotAcceptNegativeHeight() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(WIDTH, -HEIGHT));
    }
}
