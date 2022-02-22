package oop;

public class DistanceConverter {

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
