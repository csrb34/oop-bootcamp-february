package oop;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ChanceTest {

    public static final double PROBABILITY = 0.02;
    public static final double OPPOSITE_PROBABILITY = 0.98;
    private Chance chance;

    @BeforeMethod
    private void setUp() {
        chance = new Chance(PROBABILITY);
    }

    @Test
    public void shouldCalculateRollingASixProbability() {
        assertEquals(chance.calculateProbabilityOfRollingSix(), (double) 1 / 6);
    }

    @Test
    public void shouldCalculateTheProductOfTwoChances() {
        assertEquals(chance.calculateProductOfTwoChances(0.1d, 0.2d), PROBABILITY, 0.001);
    }

    @Test
    public void shouldCalculateTheProductOfTwoChancesVer2() {
        assertEquals(chance.calculateProductOfTwoChancesWithTwoDecimals(0.1d, 0.2d), PROBABILITY);
    }

    @Test
    public void shouldThrowExceptionWhenProbabilityBiggerThan1() {
        assertThrows(IllegalArgumentException.class, () -> new Chance(2));
    }

    @Test
    public void shouldThrowExceptionWhenProbabilityIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> new Chance(-1));
    }

    @Test
    public void shouldCalculateOppositeProbability() {
        assertEquals(chance.calculateOppositeProbability().getProbability(), OPPOSITE_PROBABILITY);
    }
}