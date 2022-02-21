package oop;

import java.util.Arrays;

public class Probability {
    public static double calculateProbabilityOf(final int[] numbers, final int numberToGet) {
        double numberOfOccurences = Arrays.stream(numbers)
            .filter(number -> number == numberToGet)
            .count();
        return numberOfOccurences / numbers.length;
    }
}
