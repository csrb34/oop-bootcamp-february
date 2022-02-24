package oop.car;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OwnerTest {

    Owner owner = new Owner();

    @Test
    public void itShouldPrintTopCapacityNotification() {
        assertEquals(owner.notifyMaxCapacity("PARKING_1"),
            "Parking PARKING_1 full capacity");
    }

    @Test
    public void itShouldPrintALowCapacityNotification() {
        assertEquals(owner.notifyMinCapacity("PARKING_1"),
                "Parking PARKING_1 almost empty");
    }

}