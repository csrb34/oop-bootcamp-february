package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ChanceTest {

    @Test
    public void itShouldReturnTheProbabilityValue() {
        double result = new Chance().getProbabilityOfRollingASix();
        assertEquals(result, 1/6);
    }
}
