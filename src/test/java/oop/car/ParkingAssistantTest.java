package oop.car;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.mockito.Mockito.mock;
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
        parkingAssistant.addParkingLot(parkingLot);
        assertTrue(parkingAssistant.parkCar(5));
    }

    @Test
    public void itShouldNotParkACarWhenNoSpaceLeft() {
        parkingAssistant.addParkingLot(parkingLot);
        assertTrue(parkingAssistant.parkCar(5));
        assertFalse(parkingAssistant.parkCar(5));
    }

    @Test
    public void itShouldParkACarOnAvailableParkingSlot() {
        parkingAssistant.addParkingLot(parkingLot);
        parkingAssistant.addParkingLot(new ParkingLot(2));
        assertTrue(parkingAssistant.parkCar(5));
        assertTrue(parkingAssistant.parkCar(5));
    }
}