package oop.car;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final int numberOfSpaces;
    private final List<Integer> parkedCars;

    public ParkingLot(int numberOfSpaces) {
        this.numberOfSpaces = numberOfSpaces;
        this.parkedCars = new ArrayList<>(numberOfSpaces);
    }

    public boolean parkCar(int carId) {
        if (parkedCars.size() >= numberOfSpaces) {
            return false;
        }
        parkedCars.add(carId);
        return true;
    }
}
