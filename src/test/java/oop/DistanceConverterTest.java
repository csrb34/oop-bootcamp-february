package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DistanceConverterTest {

    @Test
    public void itShouldConvertFeetToMetres() {
        double expectedMetres = 0.3048;
        double feet = 1;
        DISTANCE_CONVERSION_DEFAULTS typeOfConversion = DISTANCE_CONVERSION_DEFAULTS.FEET_TO_METERS;

        DistanceConverter distanceConverter = new DistanceConverter();

//        assertEquals(distanceConverter.convertFeetToMetres(feet), expectedMetres);
        assertTrue(distanceConverter.isEquivalent(feet, 0.3048, typeOfConversion));
    }

    @Test
    public void itShouldConvertInchesToYards() {
        double expectedYards = 0.0278;
        double inches = 1;
        DISTANCE_CONVERSION_DEFAULTS typeOfConversion = DISTANCE_CONVERSION_DEFAULTS.INCHES_TO_YARDS;

        DistanceConverter distanceConverter = new DistanceConverter();
//        assertEquals(distanceConverter.convertInchesToYards(inches), expectedYards);
        assertTrue(distanceConverter.isEquivalent(inches, 0.0278, typeOfConversion));
    }

    @Test
    public void itShouldConvertGallonToLitres() {
        double expectedLitres = 3.7854;
        double gallon = 1;
        DISTANCE_CONVERSION_DEFAULTS typeOfConversion = DISTANCE_CONVERSION_DEFAULTS.GALLON_TO_LITRES;

        DistanceConverter distanceConverter = new DistanceConverter();
//        assertEquals(distanceConverter.convertGallonToLitres(gallon), expectedLitres);
        assertTrue(distanceConverter.isEquivalent(gallon, 3.7854, typeOfConversion));
    }
}
