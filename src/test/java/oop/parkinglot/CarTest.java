package oop.parkinglot;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CarTest {

    @Test
    public void itShouldParkMyCar() {
        var car = new Car();

        car.park();

        assertTrue(car.isParked());
    }

    @Test
    public void itShouldRetrieveMyCar() {
        var car = new Car();

        car.retrieve();

        assertFalse(car.isParked());
    }
}
