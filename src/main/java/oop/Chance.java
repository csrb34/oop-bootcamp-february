package oop;

import java.text.DecimalFormat;
import java.text.NumberFormat;

// “As a math student, I want to calculate the product of two chances”
// P(A && B) = P(A) * P(B)
// Example: P(A) = 0.1  P(B) = 0.2 =>
// P(A && B) = 0.1 * 0.2 = 0.02
public class Chance {
    public static final int SURE_EVENT_PROBABILITY = 1;
    private double probability;

    public Chance(double probability) {
        setProbability(probability);
    }

    public double calculateProbabilityOfRollingSix() {
        return (double) SURE_EVENT_PROBABILITY / 6;
    }

    public double calculateProductOfTwoChances(double chance1, double chance2) {
        return chance1 * chance2;
    }

    public double calculateProductOfTwoChancesWithTwoDecimals(double chance1, double chance2) {
        double product = chance1 * chance2;
        NumberFormat formatter = new DecimalFormat("#0.00");
        return Double.parseDouble(formatter.format(product));
    }

    public Chance calculateProduct(Chance otherChance) {
        return new Chance(this.probability * otherChance.probability);
    }

    public Chance calculateOppositeProbability() {
        return new Chance(SURE_EVENT_PROBABILITY - this.probability);
    }

    public double getProbability() {
        return probability;
    }

    private void setProbability(double probability) {
        if (probability < 0 || probability > SURE_EVENT_PROBABILITY) {
            throw new IllegalArgumentException("Probability out of range");
        }
        this.probability = probability;
    }
}
