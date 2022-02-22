package oop;

public class Conversion {

    private static final double CONVERSION_FROM_FEET_TO_METRES = 0.3048;
    private final double feet;

    public Conversion(double feet) {
        this.feet = feet;
    }

    public double convertFeetToMetres() {
        return feet * CONVERSION_FROM_FEET_TO_METRES;
    }
}
