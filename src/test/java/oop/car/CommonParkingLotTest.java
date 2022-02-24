package oop.car;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.testng.Assert.*;

public class CommonParkingLotTest {

    CommonParkingLot commonParkingLot;
    ParkingListener parkingListener;


    @BeforeMethod
    void setUp(){
        parkingListener = mock(ParkingListener.class);
    }

    @Test
    public void itShouldParkCarWhenSpaceIsAvailable() {
        commonParkingLot = new CommonParkingLot(5, parkingListener, "TEST");
        assertTrue(commonParkingLot.parkIn(12));
    }

    @Test
    public void itShouldFailIfTheCapacityIsReached() {
        commonParkingLot = new CommonParkingLot(10, parkingListener, "TEST");
        parkMultipleCars(8);
        assertFalse(commonParkingLot.parkIn(9));
    }

    @Test
    public void itShouldFailWhenAddingCarIfTwoSpotsWithOneCar() {
        commonParkingLot = new CommonParkingLot(2, parkingListener, "TEST");
        assertTrue(commonParkingLot.parkIn(1));
        assertFalse(commonParkingLot.parkIn(2));
    }

    @Test
    public void itShouldNotifyOwnerWhenAlmostFull() {
        commonParkingLot = new CommonParkingLot(10, parkingListener, "PARKING_1");
        parkMultipleCars(8);
        verify(parkingListener).notifyMaxCapacity(eq("PARKING_1"));
    }

    @Test
    public void itShouldParkOutOneCar() {
        commonParkingLot = new CommonParkingLot(10, parkingListener, "PARKING_1");
        commonParkingLot.parkIn(1);
        assertTrue(commonParkingLot.parkOut(1));
    }


    @Test
    public void itShouldReturnFalseIfParkOutCarDoesNotExists() {
        commonParkingLot = new CommonParkingLot(10, parkingListener, "PARKING_1");
        commonParkingLot.parkIn(1);
        assertFalse(commonParkingLot.parkOut(2));
    }

    @Test
    public void itShouldNotifyOwnerWhenAlmostEmpty() {
        commonParkingLot = new CommonParkingLot(10, parkingListener, "PARKING_1");
        parkMultipleCars(2);
        parkOutMultipleCars(1);
        verify(parkingListener).notifyMinCapacity(eq("PARKING_1"));
    }


    @Test
    public void itShouldCalculateCurrentOccupancy() {
        commonParkingLot = new CommonParkingLot(10, parkingListener, "PARKING_1");
        parkMultipleCars(2);
        assertEquals(commonParkingLot.calculateOccupancy(), 0.25);
    }


    private void parkMultipleCars(int numberOfCars) {
        for (int i = 0; i < numberOfCars; i++) {
            commonParkingLot.parkIn(i);
        }
    }

    private void parkOutMultipleCars(int numberOfCars) {
        for (int i = 0; i < numberOfCars; i++) {
            commonParkingLot.parkOut(i);
        }
    }

}