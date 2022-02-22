package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DistanceCalculatorTest {
    @Test
    public void itShouldReturn4inchesWhenWeAdd2inchBy2Inch() {
        DistanceCalculator distanceCalculator = new DistanceCalculator();

        double sumOfInches = distanceCalculator.addDistances(2,2);

        assertEquals(4,sumOfInches);
    }
}
