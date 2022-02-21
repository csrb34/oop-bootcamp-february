package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest {

    int length = 2;
    int width = 1;
    Rectangle rectangle = new Rectangle(length, width);

    @Test
    public void calculatePerimeterThenShouldReturnTheResults() {
        int expectedResults = 6;
        int result = rectangle.calculatePerimeter();
        assertEquals(result, expectedResults);
    }

    @Test
    public void calculateAreaThenShouldReturnTheResults() {
        int expectedResults = 2;
        int result = rectangle.calculateArea();
        assertEquals(result, expectedResults);
    }
}
