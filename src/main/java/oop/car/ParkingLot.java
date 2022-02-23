package oop.car;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<Integer> parkedCars;

    public ParkingLot() {
        parkedCars = new ArrayList<>();
    }

    public void parkCar(int carId) {
        parkedCars.add(carId);
    }

    public List<Integer> getParkedCars() {
        return parkedCars;
    }
}
