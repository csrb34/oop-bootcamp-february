package oop.car;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


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

    @Test
    public void itShouldRetrieveMyCar() {
        parkingLot.parkCar(6);
        var carIsRetrieved = parkingLot.retrieveCar(6);
        assertTrue(carIsRetrieved);
    }

    @Test
    public void itShouldFailWhenRetrievingANotExistingCar() {
        var carIsRetrieved = parkingLot.retrieveCar(5);
        assertFalse(carIsRetrieved);
    }
}