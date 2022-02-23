package oop.parking;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.Mockito.verify;
import static org.testng.Assert.assertEquals;

public class ParkingLotTest {

    public static final double DELTA = 0.01;


    private final NotificationSender notificationSender = Mockito.mock(NotificationSender.class);

    @Test
    public void itShouldReturnOccupationPercentage() {
        ParkingLot parkingLot = new ParkingLot(1,10,10, notificationSender);
        assertEquals(parkingLot.getAvailabilityPercentage(), 1d, DELTA);
    }

    @Test
    public void itShouldReturnOccupationPercentageForHalfOccupation() {
        ParkingLot parkingLot = new ParkingLot(1,10,5, notificationSender);
        assertEquals(parkingLot.getAvailabilityPercentage(), 0.5d, DELTA);
    }

    @Test
    public void itShouldDecreaseTheAvailableSpotsInOneUnit() {
        ParkingLot parkingLot = new ParkingLot(1,10,5, notificationSender);
        parkingLot.fillSpot();
        assertEquals(parkingLot.getAvailabilityPercentage(), 0.4d, DELTA);
    }

    @Test
    public void itShouldShouldNotifyWhenOccupationIsOver75Percent() {
        ParkingLot parkingLot = new ParkingLot(1,5,2, notificationSender);
        parkingLot.fillSpot();
        verify(notificationSender).notifyOverUsed(parkingLot.getId());
    }
}
