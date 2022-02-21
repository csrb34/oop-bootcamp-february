package oop;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ChanceTest {

    private Chance chance;

    private static final int[] DICE = {1, 2, 3, 4, 5, 6};

    private static final int TEST_EVENT = 6;

    private static final double CHANCE_OF_SIX = 1d / 6;

    private static final double CHANCE_OF_NOT_SIX = 5d / 6;

    @BeforeMethod
    void setUp() {
        chance = new Chance(DICE);
    }

    @Test
    void shouldCalculateProbabilityOfGettingSixForDice() {
        assertEquals(chance.calculateProbabilityOfGetting(TEST_EVENT), CHANCE_OF_SIX);
    }
    
    @Test
    void itShouldCalculateChanceOfNotGettingSixForDice() {
        assertEquals(chance.calculateIProbabilityOfNotGetting( TEST_EVENT), CHANCE_OF_NOT_SIX);
    }
}