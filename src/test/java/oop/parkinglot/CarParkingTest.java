package oop.parkinglot;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CarParkingTest {
    @Test
    public void itShouldParkACarAParkingLot() {
        var parkingLot = new ParkingLot();
        var car = new Car();

        car.park(parkingLot);

        assertTrue(car.isParked());
        assertEquals(parkingLot.vehicleParked(), 1);
    }
}
