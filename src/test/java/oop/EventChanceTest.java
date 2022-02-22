package oop;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class EventChanceTest {

    private EventChance eventChance;

    private static final int[] DICE = {1, 2, 3, 4, 5, 6};

    private static final int TEST_EVENT = 6;

    private static final double CHANCE_OF_SIX = 1d / 6;

    private static final double CHANCE_OF_NOT_SIX = 5d / 6;

    @BeforeMethod
    void setUp() {
        eventChance = new EventChance(DICE);
    }

    @Test
    void shouldCalculateProbabilityOfGettingSixForDice() {
        assertEquals(eventChance.calculateProbabilityOfGetting(TEST_EVENT), CHANCE_OF_SIX);
    }
    
    @Test
    void itShouldCalculateChanceOfNotGettingSixForDice() {
        assertEquals(eventChance.calculateOfProbabilityOfNotGetting( TEST_EVENT), CHANCE_OF_NOT_SIX);
    }
}