package oop.parking;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ParkingAssistantTest {

    private final Car myCar = new Car();

    @Test
    public void itShouldBeAbleToParkACar() {
        var assistant = new ParkingAssistant();

        assistant.park(myCar);
        assertTrue(myCar.isParked());
    }
}
