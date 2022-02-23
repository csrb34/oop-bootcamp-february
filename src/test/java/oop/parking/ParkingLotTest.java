package oop.parking;

import org.testng.annotations.Test;

import static org.mockito.Mockito.verify;
import static org.testng.Assert.assertEquals;

public class ParkingLotTest {

    public static final double DELTA = 0.01;

    private final NotificationSender notificationSender = new NotificationSender();

    @Test
    public void itShouldReturnOccupationPercentage() {
        ParkingLot parkingLot = new ParkingLot(1,10,10);
        assertEquals(parkingLot.getAvailabilityPercentage(), 1d, DELTA);
    }

    @Test
    public void itShouldReturnOccupationPercentageForHalfOccupation() {
        ParkingLot parkingLot = new ParkingLot(1,10,5);
        assertEquals(parkingLot.getAvailabilityPercentage(), 0.5d, DELTA);
    }

    @Test
    public void itShouldDecreaseTheAvailableSpotsInOneUnit() {
        ParkingLot parkingLot = new ParkingLot(1,10,5);
        parkingLot.fillSpot();
        assertEquals(parkingLot.getAvailabilityPercentage(), 0.4d, DELTA);
    }

    @Test
    public void itShouldShouldNotifyWhenOccupationIsOver75Percent() {
        ParkingLot parkingLot = new ParkingLot(1,5,3);
        parkingLot.fillSpot();
        verify(notificationSender).notifyOverUsed(parkingLot.getId());
    }
}
