package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DiceClass {

    @Test
    public void itShouldCalculateTheChanceFor6Sides() {
        Dice dice = new Dice(6);
        assertEquals(dice.calculateChance(), 16.67, 2);
    }
}
