package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ChanceTest {

    @Test
    public void itShouldReturnTheProbabilityValue() {
        double result = new Chance().calculateProbabilityOfRollingASix();
        assertEquals(result, 1.0/6.0);
    }

    @Test
    public void itShouldReturnTheProbabilityOfNotGettingASix() {
        double result = new Chance().calculateProbabilityOfNotRollingASix();
        assertEquals(result, 5.0/6.0);
    }

}
