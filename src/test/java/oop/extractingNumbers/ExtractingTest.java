package oop.extractingNumbers;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExtractingTest {

    public static final int[] NUMBERS = new int[] {1, 2, 3, 4, 5};

    @Test
    public void itShouldExtractMinimumValue() {
        assertEquals(Extracting.getMinimum(NUMBERS), 1);
    }

    @Test
    public void itShouldExtractMaximumValue() {
        assertEquals(Extracting.getMaximum(NUMBERS), 5);
    }

    @Test
    public void itShouldReturnTheLength() {
        assertEquals(Extracting.lenght(NUMBERS), 5);
    }

    @Test
    public void itShouldCalculateAverage() {
        assertEquals(Extracting.average(NUMBERS), 3d);

    }
}
