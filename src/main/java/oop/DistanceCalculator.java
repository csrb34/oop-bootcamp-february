package oop;

public class DistanceCalculator extends DistanceConverter{

    public DistanceCalculator() {
    }

    public double addDistances(double value, double value2) {
        return value + value2;
    }

    public double addForDifferentDistances(double value, double value2){
        double convertedDistance = convertValue(value2, DISTANCE_CONVERSION_DEFAULTS.METRES_TO_INCHES);
        return value + convertedDistance;
    }
}
