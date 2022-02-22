package oop;

public enum DISTANCE_CONVERSION_DEFAULTS {
    FEET_TO_METERS(0.3048),
    INCHES_TO_YARDS(0.0278),
    GALLON_TO_LITRES(3.7854);

    private double defaultValue;

    DISTANCE_CONVERSION_DEFAULTS(double defaultValue) {
        this.defaultValue = defaultValue;
    }

     public double getDefaultValue() {
            return defaultValue;
     }
}

