package oop.parking;

import org.mockito.Mockito;
import org.testng.annotations.Test;

import static org.mockito.Mockito.verify;

public class ParkingAssistantTest {

    private final Car myCar = Mockito.mock(Car.class);

    @Test
    public void itShouldBeAbleToParkACar() {
        var assistant = new ParkingAssistant();

        assistant.park(myCar);

        verify(myCar).park();
    }
}
