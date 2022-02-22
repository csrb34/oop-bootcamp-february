package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConversionTest {

    @Test
    public void itShouldConvertFeetToMetres() {
        double expectedMetres = 0.3048;
        double feet = 1;

        Conversion conversion = new Conversion(feet);
        assertEquals(conversion.convertFeetToMetres(), expectedMetres);
    }

    @Test
    public void itShouldConvertInchesToYards() {
        double expectedYards = 0.0278;
        double inches = 1;

        Conversion conversion = new Conversion(inches);
        assertEquals(conversion.convertInchesToYards(), expectedYards);
    }
}
