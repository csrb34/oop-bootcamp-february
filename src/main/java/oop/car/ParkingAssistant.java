package oop.car;

import java.util.List;
import java.util.stream.Stream;

//"A parking lot assistant handles multiple parking lots, parking a car in the first parking lot with space"

//A parking lot assistant handles multiple parking lots, parking a car in the first parking lot with space"
//"A parking lot assistant parks a car in a parking lot only if it is less than 80% full"

//"I (owner) want to be notified when a parking lot usage is over 75% so that I can buy more land"
public class ParkingAssistant {
    private final List<ParkingLot> parkingLots;

    public ParkingAssistant(List<ParkingLot> parkingLotList) {
        this.parkingLots = parkingLotList;
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