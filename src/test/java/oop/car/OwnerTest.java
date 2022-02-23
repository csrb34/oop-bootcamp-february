package oop.car;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class OwnerTest {

    Owner owner = new Owner();

    @Test
    public void itShouldPrintNotification() {
        assertEquals(owner.printNotification("PARKING_1"),
            "Parking PARKING_1 full capacity");
    }

}