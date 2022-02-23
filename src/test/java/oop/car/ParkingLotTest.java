package oop.car;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ParkingLotTest {

    ParkingLot parkingLot;

    @Test
    public void itShouldParkCarWhenSpaceIsAvailable() {
        parkingLot = new ParkingLot(5);
        assertTrue(parkingLot.parkCar(12));
    }

    @Test
    public void itShouldDoAnythingWhenCarIsAlreadyParked() {
        parkingLot = new ParkingLot(1);
        assertTrue(parkingLot.parkCar(12));
        assertFalse(parkingLot.parkCar(12));
    }

}