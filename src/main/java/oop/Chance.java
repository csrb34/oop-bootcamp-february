package oop;

import java.util.Arrays;

public class Chance {

    private final int[] events;

    private static final int FULL_EVENT_CHANCE = 1;

    public Chance(final int[] events) {
        this.events = events;
    }

    public double calculateProbabilityOfGetting(final int event) {
        double numberOfOccurrences = Arrays.stream(this.events)
            .filter(number -> number == event)
            .count();
        return numberOfOccurrences / this.events.length;
    }

    public double calculateIProbabilityOfNotGetting(final int event) {
        return FULL_EVENT_CHANCE - calculateProbabilityOfGetting(event);
    }
}
