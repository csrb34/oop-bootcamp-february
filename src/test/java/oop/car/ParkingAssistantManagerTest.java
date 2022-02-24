package oop.car;

import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class ParkingAssistantManagerTest {
    @Test
    public void itShouldHireAnAssistant() {
        List<ParkingLot> parkingLots = List.of();
        ParkingAssistantManager parkingAssistantManagerManager = new ParkingAssistantManager(parkingLots, false);
        parkingAssistantManagerManager.hire();
        assertEquals(parkingAssistantManagerManager.getAssistantsList().size(), 1);
    }

}