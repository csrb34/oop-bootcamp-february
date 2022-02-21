package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DiceTest {

    @Test
    public void shouldCalculateRollingASixProbability() {
        var dice = new Dice();

        assertEquals(dice.calculateProbabilityOfRollingSix(), (double) 1 / 6);
    }
}