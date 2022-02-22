package oop;

public class DistanceConverter {

    private static final double CONVERSION_FROM_FEET_TO_METRES = 0.3048;
    private static final double CONVERSION_FROM_INCHES_TO_YARDS = 0.0278;
    private static final double CONVERSION_FROM_GALLON_TO_LITRES = 3.7854;

    public DistanceConverter() {
    }

    public double convertValue(double originalValue, DISTANCE_CONVERSION_DEFAULTS typeOfConversion) {
        return originalValue * typeOfConversion.getDefaultValue();
    }

    public boolean isEquivalent(double originalDistanceUnit, double anotherDistanceUnit, DISTANCE_CONVERSION_DEFAULTS typeOfConversion) {
        double convertedValue = convertValue(originalDistanceUnit, typeOfConversion);
        return (convertedValue == anotherDistanceUnit) ? true : false;
    }
}
