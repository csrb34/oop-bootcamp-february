package oop.car;

import java.util.ArrayList;
import java.util.List;

//"A parking lot assistant handles multiple parking lots, parking a car in the first parking lot with space"

//A parking lot assistant handles multiple parking lots, parking a car in the first parking lot with space"
//"A parking lot assistant parks a car in a parking lot only if it is less than 80% full"
public class ParkingAssistant {
    private final List<ParkingLot> parkingLots;

    public ParkingAssistant() {
        parkingLots = new ArrayList<>();
    }

    public void addParkingLot(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }

    public boolean parkCar(int carId) {
        for (ParkingLot parkingLot : parkingLots) {
            if (parkingLot.parkCar(carId)) {
                return true;
            }
        }
        return false;
    }
}