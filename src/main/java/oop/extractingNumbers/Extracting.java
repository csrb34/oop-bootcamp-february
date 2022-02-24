package oop.extractingNumbers;

import java.util.Arrays;

public class Extracting {
    public static int getMinimum(int[] numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }

    public static int getMaximum(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }

    public static int lenght(int[] numbers) {
        return numbers.length;
    }

    public static double average(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();
    }
}
