package oop.primitives;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class StatisticsTest {

    List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6);

    @Test
    public void itShouldReturnMinimumValue() {
        var minValue = Statistics.getMinimumValue(listOfNumbers);

        assertEquals(minValue,1);
    }

    @Test
    public void itShouldReturnMaximumValue() {
        var maxValue = Statistics.getMaximumValue(listOfNumbers);

        assertEquals(maxValue,6);
    }

    @Test
    public void itShouldReturnNumberOfElements() {
        var size = Statistics.getNumberOfElements(listOfNumbers);

        assertEquals(size,6);
    }

    @Test
    public void itShouldReturnAverageValue() {
        var averageValue = Statistics.getAverageValue(listOfNumbers);

        assertEquals(averageValue,3);
    }
}