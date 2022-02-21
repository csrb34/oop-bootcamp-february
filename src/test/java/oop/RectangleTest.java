package oop;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void itShouldCreateARectangle() {
        Rectangle rec1 = new Rectangle(2.0, 3.0, "anyColor");

        Assert.assertTrue(rec1 instanceof Rectangle);

    }
    @Test
    public void itShouldCalculateTheArea() {
        Rectangle rec1 = new Rectangle(2.0, 3.0, "anyColor");

        assertEquals(rec1.calculateArea(), 6.0);
    }

    @Test
    public void itShouldCalculateThePerimeter() {
        Rectangle rec1 = new Rectangle(2.0, 3.0, "anyColor");

        assertEquals(rec1.calculatePerimeter(), 10.0);
    }
}
