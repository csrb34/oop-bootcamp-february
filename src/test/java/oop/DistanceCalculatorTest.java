package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DistanceCalculatorTest {
    DistanceCalculator distanceCalculator = new DistanceCalculator();

    @Test
    public void itShouldReturn4inchesWhenWeAdd2inchBy2Inch() {
        double sumOfInches = distanceCalculator.addDistances(2,2);

        assertEquals(4,sumOfInches);
    }

    @Test
    public void itShouldReturnTheCalculationInInches() {
        double result = 41.37008;

        double sumOfInches = distanceCalculator.addForDifferentDistances(2,1);

        assertEquals(result,sumOfInches,0.001);
    }
}
