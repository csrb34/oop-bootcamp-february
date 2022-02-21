package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DiceTest {

    @Test
    public void itShouldCalculateTheChanceFor6Sides() {
        Dice dice = new Dice(6);
        assertEquals(dice.calculateChance(), 16.67, 2);
    }

    @Test
    public void itShouldCalculateTheChanceOfNotGettingA6() {
        Dice dice = new Dice(6);
        assertEquals(100 - dice.calculateChance(), 83.33, 2);

    }
}
