package oop.car;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class ParkingAssistantTest {

    ParkingAssistant parkingAssistant;
    ParkingLot parkingLot;

    @BeforeMethod
    public void setUp() {
        parkingAssistant = new ParkingAssistant();
        parkingLot = mock(ParkingLot.class);
    }

    @Test
    public void itShouldBeAbleToParkACar() {
        when(parkingLot.parkCar(anyInt())).thenReturn(true);
        parkingAssistant.addParkingLot(parkingLot);
        assertTrue(parkingAssistant.parkCar(5));
    }

    @Test
    public void itShouldNotParkACarWhenNoSpaceLeft() {
        when(parkingLot.parkCar(anyInt())).thenReturn(true).thenReturn(false);
        parkingAssistant.addParkingLot(parkingLot);
        assertTrue(parkingAssistant.parkCar(5));
        assertFalse(parkingAssistant.parkCar(5));
    }

    @Test
    public void itShouldParkACarOnAvailableParkingSlot() {
        when(parkingLot.parkCar(anyInt())).thenReturn(false);
        ParkingLot parkingLot2 = mock(ParkingLot.class);
        when(parkingLot2.parkCar(anyInt())).thenReturn(true);
        parkingAssistant.addParkingLot(parkingLot);
        parkingAssistant.addParkingLot(parkingLot2);
        assertTrue(parkingAssistant.parkCar(5));
    }
}