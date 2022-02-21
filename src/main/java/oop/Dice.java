package oop;

public class Dice {
    private final int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double calculateChance() {
        return ((double) 1/numberOfSides) * 100;
    }
}
