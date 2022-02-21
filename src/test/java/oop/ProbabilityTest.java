package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProbabilityTest {

    @Test
    public void shouldCalculateProbabilityOfGettingSixForDice() {
        final int[] dice = {1, 2, 3, 4, 5, 6};
        assertEquals(Probability.calculateProbabilityOf(dice, 6), (double) 1 / 6);
    }
}