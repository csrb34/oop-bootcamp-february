package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest {

    double length = 2;
    double width = 1;
    Rectangle rectangle = new Rectangle(length, width);

    @Test
    public void calculatePerimeterThenShouldReturnTheResults() {
        double expectedResults = 6;
        double result = rectangle.calculatePerimeter();
        assertEquals(result, expectedResults);
    }

    @Test
    public void calculateAreaThenShouldReturnTheResults() {
        double expectedResults = 2;
        double result = rectangle.calculateArea();
        assertEquals(result, expectedResults);
    }
}
