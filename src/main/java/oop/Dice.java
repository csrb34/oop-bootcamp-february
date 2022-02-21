package oop;

public class Dice {
    private final int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double calculateChance() {
        if (numberOfSides == 1) return 100;
        if (numberOfSides == 2) return 50;
        if (numberOfSides == 3) return 33.33;
        if (numberOfSides == 4) return 25;
        if (numberOfSides == 5) return 20;
        else return 16.67;
    }
}
