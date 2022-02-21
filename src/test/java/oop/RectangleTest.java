package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void itShouldCalculateTheArea() {
        Rectagle rec1 = new Rectagle(2.0,3.0, "anyColor");

        assertEquals(rec1.getArea(), 6.0);
    }
}
