package oop;

public class DistanceConverter {

    private static final double CONVERSION_FROM_FEET_TO_METRES = 0.3048;
    private static final double CONVERSION_FROM_INCHES_TO_YARDS = 0.0278;
    private static final double CONVERSION_FROM_GALLON_TO_LITRES = 3.7854;

    public DistanceConverter() {
    }

    private double converterToUse(double originalDistanceUnit, String typeOfConversion) {
        double convertedValue;

        switch (typeOfConversion) {
            case "feet_to_metre":
                convertedValue = convertFeetToMetres(originalDistanceUnit);
                break;
            case "inches_to_yards":
                convertedValue = convertInchesToYards(originalDistanceUnit);
                break;
            case "gallons_to_litres":
                convertedValue = convertGallonToLitres(originalDistanceUnit);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typeOfConversion);
        }
        return convertedValue;
    }

    public double convertFeetToMetres(double feet) {
        return feet * CONVERSION_FROM_FEET_TO_METRES;
    }

    public double convertInchesToYards(double inches) {
        return inches * CONVERSION_FROM_INCHES_TO_YARDS;
    }

    public double convertGallonToLitres(double gallon) {
        return gallon * CONVERSION_FROM_GALLON_TO_LITRES;
    }

    public boolean isEquivalent(double originalDistanceUnit, double anotherDistanceUnit, String typeOfConversion) {
        double convertedValue = converterToUse(originalDistanceUnit, typeOfConversion);
        return (convertedValue == anotherDistanceUnit) ? true : false;
    }
}
