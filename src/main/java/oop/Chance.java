package oop;

public class Chance {

    public double calculateProbabilityOfRollingASix() {
        return (double) 1/6;
    }

    public double calculateProbabilityOfNotRollingASix() {
        return 1 - calculateProbabilityOfRollingASix();
    }
}
