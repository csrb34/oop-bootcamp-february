package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DiceClass {

    @Test
    public void itShouldCalculateTheChance() {
        Dice dice = new Dice(1);
        assertEquals(dice.calculateChance(), 100);
    }
}
