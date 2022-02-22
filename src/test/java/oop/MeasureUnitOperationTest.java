package oop;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MeasureUnitOperationTest {
    @Test
    public void itShouldAddInches() {
        var inches = new InchMeasureUnit(2d);
        var inchesToAdd = new InchMeasureUnit(2d);

        assertEquals(inches.add(inchesToAdd).getMeasure(), 4, 0.0001);
    }

}
