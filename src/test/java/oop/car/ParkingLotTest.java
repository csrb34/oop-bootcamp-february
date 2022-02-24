package oop.car;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.testng.Assert.*;

public class ParkingLotTest {

    ParkingLot parkingLot;
    ParkingListener parkingListener;


    @BeforeMethod
    void setUp(){
        parkingListener = mock(ParkingListener.class);
    }

    @Test
    public void itShouldParkCarWhenSpaceIsAvailable() {
        parkingLot = new ParkingLot(5, parkingListener, "TEST");
        assertTrue(parkingLot.parkIn(12));
    }

    @Test
    public void itShouldFailIfTheCapacityIsReached() {
        parkingLot = new ParkingLot(10, parkingListener, "TEST");
        parkMultipleCars(8);
        assertFalse(parkingLot.parkIn(9));
    }

    @Test
    public void itShouldFailWhenAddingCarIfTwoSpotsWithOneCar() {
        parkingLot = new ParkingLot(2, parkingListener, "TEST");
        assertTrue(parkingLot.parkIn(1));
        assertFalse(parkingLot.parkIn(2));
    }

    @Test
    public void itShouldNotifyOwnerWhenAlmostFull() {
        parkingLot = new ParkingLot(10, parkingListener, "PARKING_1");
        parkMultipleCars(8);
        verify(parkingListener).notifyMaxCapacity(eq("PARKING_1"));
    }

    @Test
    public void itShouldParkOutOneCar() {
        parkingLot = new ParkingLot(10, parkingListener, "PARKING_1");
        parkingLot.parkIn(1);
        assertTrue(parkingLot.parkOut(1));
    }


    @Test
    public void itShouldReturnFalseIfParkOutCarDoesNotExists() {
        parkingLot = new ParkingLot(10, parkingListener, "PARKING_1");
        parkingLot.parkIn(1);
        assertFalse(parkingLot.parkOut(2));
    }

    @Test
    public void itShouldNotifyOwnerWhenAlmostEmpty() {
        parkingLot = new ParkingLot(10, parkingListener, "PARKING_1");
        parkMultipleCars(2);
        parkOutMultipleCars(1);
        verify(parkingListener).notifyMinCapacity(eq("PARKING_1"));
    }


    @Test
    public void itShouldCalculateCurrentOccupancy() {
        parkingLot = new ParkingLot(10, parkingListener, "PARKING_1");
        parkMultipleCars(2);
        assertEquals(parkingLot.calculateOccupancy(), 0.20);
    }


    private void parkMultipleCars(int numberOfCars) {
        for (int i = 0; i < numberOfCars; i++) {
            parkingLot.parkIn(i);
        }
    }

    private void parkOutMultipleCars(int numberOfCars) {
        for (int i = 0; i < numberOfCars; i++) {
            parkingLot.parkOut(i);
        }
    }

}