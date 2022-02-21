package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ChanceTest {

    @Test
    public void itShouldReturnTheProbabilityValue() {
        double result = new Chance().calculateProbabilityOfRollingASix();
        assertEquals(result, 1.0/6.0);
    }

//    “As a math student, I want to calculate the chance of not getting a 6 when rolling a dice”
//
//    Clemencio Morales Lucas, 6 min
//    P(!A) = 1 - P(A)
//    Example: P(A) = 0.25  =>  P(!A) = 1 - 0.25 = 0.75
    @Test
    public void itShouldReturnTheProbabilityOfNotGettingASix() {
        double result = new Chance().calculateProbabilityOfNotRollingASix();
        assertEquals(result, 5.0/6.0);
    }

}
