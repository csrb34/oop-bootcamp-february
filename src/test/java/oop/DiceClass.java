package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DiceClass {

    @Test
    public void itShouldCalculateTheChanceFor1Side() {
        Dice dice = new Dice(1);
        assertEquals(dice.calculateChance(), 100);
    }

    @Test
    public void itShouldCalculateTheChanceFor2Sides() {
        Dice dice = new Dice(2);
        assertEquals(dice.calculateChance(), 50);
    }

    @Test
    public void itShouldCalculateTheChanceFor3Sides() {
        Dice dice = new Dice(3);
        assertEquals(dice.calculateChance(), 33.33);
    }

    @Test
    public void itShouldCalculateTheChanceFor4Sides() {
        Dice dice = new Dice(4);
        assertEquals(dice.calculateChance(), 25);
    }

    @Test
    public void itShouldCalculateTheChanceFor5Sides() {
        Dice dice = new Dice(5);
        assertEquals(dice.calculateChance(), 20);
    }

    @Test
    public void itShouldCalculateTheChanceFor6Sides() {
        Dice dice = new Dice(6);
        assertEquals(dice.calculateChance(), 16.67);
    }
}
