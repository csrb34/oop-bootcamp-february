package oop.primitives;

import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;

public class Statistics {
    public static int getMinimumValue(List<Integer> listOfNumbers) {
        return Collections.min(listOfNumbers);
    }

    public static int getMaximumValue(List<Integer> listOfNumbers) {
        return Collections.max(listOfNumbers);
    }

    public static int getNumberOfElements(List<Integer> listOfNumbers) {
        return listOfNumbers.size();
    }

    public static int getAverageValue(List<Integer> listOfNumbers) {
        OptionalDouble average = listOfNumbers.stream()
                .mapToDouble(number -> number)
                .average();
        return (int) average.orElse(0.0);
    }
}