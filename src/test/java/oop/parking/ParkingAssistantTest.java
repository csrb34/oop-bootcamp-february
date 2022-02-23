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

        final List<ParkingLot> parkingLots = List.of(new ParkingLot(1,10, 5));
        var assistant = new ParkingAssistant(parkingLots);

        assistant.park(myCar);
        verify(myCar).park();

    }

    @Test
    public void itShouldNotParkACarParkingIsMoreThan80PercentFull() {
        final List<ParkingLot> parkingLots = List.of(new ParkingLot(1,10, 1));

        var assistant = new ParkingAssistant(parkingLots);

        assistant.park(myCar);

        verify(myCar, times(0)).park();
    }

    @Test
    public void itShouldParkACarInTheSecondAParkingLot() {

        final List<ParkingLot> parkingLots = List.of(new ParkingLot(1,6, 1), new ParkingLot(2,10,10));
        var assistant = new ParkingAssistant(parkingLots);

        final var parkingLotId = assistant.park(myCar);

        assertEquals(parkingLotId, 2);
        verify(myCar).park();

    }
}
