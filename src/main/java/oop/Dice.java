package oop;

public class Dice {
    private final int numberOfSides;
    int SURE_EVENT_PROBABILITY = 100;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public double calculateChanceOfHavingANumber() {
        return ((double) 1 / numberOfSides) * SURE_EVENT_PROBABILITY;
    }

    public double calculateChanceOfNotHavingANumber() {
        return SURE_EVENT_PROBABILITY - calculateChanceOfHavingANumber();
    }
}
