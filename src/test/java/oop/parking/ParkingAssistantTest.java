package oop.parking;

import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.testng.Assert.assertEquals;

public class ParkingAssistantTest {

    private  Car myCar;

    @BeforeMethod
    public void setUp() {
        myCar = Mockito.mock(Car.class);
    }

    @Test
    public void itShouldParkACarInAParkingLotWhenOcupationIsLessThan80Percent() {
        final List<Integer> parkingLotsFreeSpots =  Arrays.asList(5);
        final List<Integer> parkingInitialCapacity =  Arrays.asList(10);
        var assistant = new ParkingAssistant(parkingLotsFreeSpots, parkingInitialCapacity);

        assistant.park(myCar);

        assertEquals(assistant.getParkingLotsFreeSpots(), Arrays.asList(4));
        verify(myCar).park();

    }

    @Test
    public void itShouldNotParkACarParkingIsMoreThan80PercentFull() {
        final List<Integer> parkingLotsFreeSpots =  Arrays.asList(1);
        final List<Integer> parkingInitialCapacity =  Arrays.asList(10);

        var assistant = new ParkingAssistant(parkingLotsFreeSpots, parkingInitialCapacity);

        assistant.park(myCar);

        verify(myCar, times(0)).park();
    }

    @Test
    public void itShouldParkACarInTheSecondAParkingLot() {
        final List<Integer> parkingLotsFreeSpots =  Arrays.asList(1, 5);
        final List<Integer> parkingInitialCapacity =  Arrays.asList(10, 10);
        var assistant = new ParkingAssistant(parkingLotsFreeSpots, parkingInitialCapacity);

        assistant.park(myCar);

        assertEquals(assistant.getParkingLotsFreeSpots(), Arrays.asList(1, 4));
        verify(myCar).park();

    }
}
