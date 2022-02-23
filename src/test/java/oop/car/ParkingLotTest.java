package oop.car;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParkingLotTest {

    ParkingLot parkingLot;

    @BeforeMethod
    public void setUp() {
        parkingLot = new ParkingLot();
    }

    @Test
    public void itShouldBeAbleToParkACar() {
        parkingLot.parkCar(5);
        assertEquals(parkingLot.getParkedCars().size(), 1);
        assertEquals(parkingLot.getParkedCars().get(0), 5);
    }
}