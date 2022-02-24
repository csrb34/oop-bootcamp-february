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
    CommonParkingLot commonParkingLot;

    @BeforeMethod
    public void setUp() {
        commonParkingLot = mock(CommonParkingLot.class);
        var parkingLotList = new ArrayList<ParkingLot>();
        parkingLotList.add(commonParkingLot);
        parkingAssistant = new ParkingAssistant(parkingLotList);
    }

    @Test
    public void itShouldBeAbleToParkACar() {
        when(commonParkingLot.parkIn(anyInt())).thenReturn(true);
        assertTrue(parkingAssistant.parkCar(5));
    }

    @Test
    public void itShouldNotParkACarWhenNoSpaceLeft() {
        when(commonParkingLot.parkIn(anyInt())).thenReturn(true).thenReturn(false);
        assertTrue(parkingAssistant.parkCar(5));
        assertFalse(parkingAssistant.parkCar(5));
    }

    @Test
    public void itShouldParkACarOnAvailableParkingSlot() {
        when(commonParkingLot.parkIn(anyInt())).thenReturn(false);
        CommonParkingLot commonParkingLot2 = mock(CommonParkingLot.class);
        when(commonParkingLot2.parkIn(anyInt())).thenReturn(true);
        parkingAssistant.addParkingLot(commonParkingLot2);
        assertTrue(parkingAssistant.parkCar(5));
    }

    @Test
    public void itShouldParkLargeCarOnLessPercentageParkingSlot() {
        when(commonParkingLot.parkIn(anyInt())).thenReturn(true);
        when(commonParkingLot.calculateOccupancy()).thenReturn(0.2);
        CommonParkingLot commonParkingLot2 = mock(CommonParkingLot.class);
        when(commonParkingLot2.parkIn(anyInt())).thenReturn(true);
        when(commonParkingLot2.calculateOccupancy()).thenReturn(0.3);
        parkingAssistant.addParkingLot(commonParkingLot2);
        assertTrue(parkingAssistant.parkLargeCar(5));
        verify(commonParkingLot).parkIn(eq(5));
    }

    @Test
    public void itShouldNotParkLargeCarIfNotParkingLot() {
        parkingAssistant = new ParkingAssistant(List.of());
        assertFalse(parkingAssistant.parkLargeCar(5));
    }

    @Test
    public void itShouldParkHandicapCar() {
        HandicapParkingLot handicapParkingLot = mock(HandicapParkingLot.class);
        when(handicapParkingLot.parkIn(anyInt())).thenReturn(true);
        when(handicapParkingLot.isHandicapLot()).thenReturn(true);
        parkingAssistant = new ParkingAssistant(List.of(handicapParkingLot));
        assertTrue(parkingAssistant.parkHandicapCar(5));
    }

    @Test
    public void itShouldNotParkCommonCarInAHandicapCarSlot() {
        assertFalse(parkingAssistant.parkHandicapCar(5));
    }

    @Test
    public void itShouldParkFancyCarIfCertified() {
        when(commonParkingLot.parkIn(anyInt())).thenReturn(true);
        var parkingLotList = new ArrayList<ParkingLot>();
        parkingLotList.add(commonParkingLot);
        parkingAssistant = new ParkingAssistant(parkingLotList, true);
        assertTrue(parkingAssistant.parkCar(2, true));
    }

    @Test
    public void itShouldNotParkFancyCarIfNotCertified() {
        assertFalse(parkingAssistant.parkCar(2,true));
    }
}