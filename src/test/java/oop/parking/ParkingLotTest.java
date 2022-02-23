package oop.parking;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParkingLotTest {
    @Test
    public void itShouldReturnOccupationPercentage() {
        ParkingLot parkingLot = new ParkingLot(10,10);
        assertEquals(parkingLot.getOccupationPercentage(), 1d, 1);
    }

    @Test
    public void itShouldReturnOccupationPercentageForHalfOccupation() {
        ParkingLot parkingLot = new ParkingLot(10,5);
        assertEquals(parkingLot.getOccupationPercentage(), 0.5d, 0.1);
    }
}
