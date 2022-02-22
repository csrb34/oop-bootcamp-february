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
}
