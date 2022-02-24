package oop.parking;

import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.verify;
import static org.testng.Assert.assertEquals;

public class ParkingLotTest {

    public static final double DELTA = 0.01;

    private NotificationSender notificationSender;


    @BeforeMethod
    public void setUp() {
        notificationSender = Mockito.mock(NotificationSender.class);
    }
    @Test
    public void itShouldReturnOccupationPercentage() {
        ParkingLot parkingLot = new ParkingLot(1,10,1, notificationSender);
        assertEquals(parkingLot.calculateOccupancyPercentage(), 0.1d, DELTA);
    }

    @Test
    public void itShouldReturnOccupationPercentageForHalfOccupation() {
        ParkingLot parkingLot = new ParkingLot(1,10,5, notificationSender);
        assertEquals(parkingLot.calculateOccupancyPercentage(), 0.5d, DELTA);
    }

    @Test
    public void itShouldDecreaseTheAvailableSpotsInOneUnit() {
        ParkingLot parkingLot = new ParkingLot(1,10,5, notificationSender);
        parkingLot.fillSpot();
        assertEquals(parkingLot.calculateOccupancyPercentage(), 0.6d, DELTA);
    }

    @Test
    public void itShouldShouldNotifyWhenOccupationIsOver75Percent() {
        ParkingLot parkingLot = new ParkingLot(1,4,2, notificationSender);
        parkingLot.fillSpot();
        verify(notificationSender).notifyOverUsed(parkingLot.getId());
    }

    @Test
    public void itShouldShouldNotifyWhenOccupationIsLessThan20Percent() {
        ParkingLot parkingLot = new ParkingLot(1,10,1, notificationSender);
        parkingLot.fillSpot();
        verify(notificationSender).notifyMisused(parkingLot.getId());
    }
}
