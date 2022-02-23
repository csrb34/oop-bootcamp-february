package oop.parking;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CarTest {

    Car car;

    @BeforeTest
    public void setUp() {
        car = new Car();
    }

    @Test
    public void itShouldParkMyCar() {
        car.park();

        assertTrue(car.isParked());
    }

    @Test
    public void itShouldRetrieveMyCarWhichIsParked() {
        car.park();
        car.retrieve();

        assertFalse(car.isParked());
    }
}
