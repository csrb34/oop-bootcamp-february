package oop;

public class Conversion {

    private static final double CONVERSION_FROM_FEET_TO_METRES = 0.3048;
    private static final double CONVERSION_FROM_INCHES_TO_YARDS = 0.0278;
    private final double value;

    public Conversion(double value) {
        this.value = value;
    }

    public double convertFeetToMetres() {
        return value * CONVERSION_FROM_FEET_TO_METRES;
    }
    public double convertInchesToYards() {
        return value * CONVERSION_FROM_INCHES_TO_YARDS;
    }
}
