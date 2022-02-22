package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DiceTest {

    @Test
    public void itShouldCalculateTheChanceFor6Sides() {
        Dice dice = new Dice(6);
        assertEquals(dice.calculateChanceOfHavingANumber(), 16.67, 2);
    }

    @Test
    public void itShouldCalculateTheChanceOfNotGettingA6() {
        Dice dice = new Dice(6);
        assertEquals(dice.calculateChanceOfNotHavingANumber(), 83.33, 2);

    }
}
