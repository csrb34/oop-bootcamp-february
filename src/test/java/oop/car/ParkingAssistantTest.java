package oop.car;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class ParkingAssistantTest {

    ParkingAssistant parkingAssistant;
    ParkingLot parkingLot;

    @BeforeMethod
    public void setUp() {
        parkingLot = mock(ParkingLot.class);
        var parkingLotList = new ArrayList<ParkingLot>();
        parkingLotList.add(parkingLot);
        parkingAssistant = new ParkingAssistant(parkingLotList);
    }

    @Test
    public void itShouldBeAbleToParkACar() {
        when(parkingLot.parkIn(anyInt())).thenReturn(true);
        assertTrue(parkingAssistant.parkCar(5));
    }

    @Test
    public void itShouldNotParkACarWhenNoSpaceLeft() {
        when(parkingLot.parkIn(anyInt())).thenReturn(true).thenReturn(false);
        assertTrue(parkingAssistant.parkCar(5));
        assertFalse(parkingAssistant.parkCar(5));
    }

    @Test
    public void itShouldParkACarOnAvailableParkingSlot() {
        when(parkingLot.parkIn(anyInt())).thenReturn(false);
        ParkingLot parkingLot2 = mock(ParkingLot.class);
        when(parkingLot2.parkIn(anyInt())).thenReturn(true);
        parkingAssistant.addParkingLot(parkingLot2);
        assertTrue(parkingAssistant.parkCar(5));
    }

    @Test
    public void itShouldParkLargeCarOnLessPercentageParkingSlot() {
        when(parkingLot.parkIn(anyInt())).thenReturn(true);
        when(parkingLot.calculateOccupancy()).thenReturn(0.2);
        ParkingLot parkingLot2 = mock(ParkingLot.class);
        when(parkingLot2.parkIn(anyInt())).thenReturn(true);
        when(parkingLot2.calculateOccupancy()).thenReturn(0.3);
        parkingAssistant.addParkingLot(parkingLot2);
        assertTrue(parkingAssistant.parkLargeCar(5));
        verify(parkingLot).parkIn(eq(5));
    }

    @Test
    public void itShouldNotParkLargeCarIfNotParkingLot() {
        parkingAssistant = new ParkingAssistant(List.of());
        assertFalse(parkingAssistant.parkLargeCar(5));
    }
}