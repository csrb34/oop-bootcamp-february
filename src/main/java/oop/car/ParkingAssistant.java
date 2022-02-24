package oop.car;

import java.util.Comparator;
import java.util.List;

public class ParkingAssistant {
    private final List<ParkingLot> commonParkingLots;

    public ParkingAssistant(List<ParkingLot> commonParkingLotList) {
        this.commonParkingLots = commonParkingLotList;
    }

    public void addParkingLot(ParkingLot commonParkingLot) {
        commonParkingLots.add(commonParkingLot);
    }

    public boolean parkCar(int carId) {
        for (ParkingLot parkingLot : commonParkingLots) {
            if (parkingLot.parkIn(carId)) {
                return true;
            }
        }
        return false;
    }

    public boolean parkLargeCar(int carId) {
        ParkingLot parkingLot = commonParkingLots.stream()
                .min(Comparator.comparingDouble(ParkingLot::calculateOccupancy))
                .orElse(null);
        return parkingLot != null && parkingLot.parkIn(carId);
    }

    public boolean parkHandicapCar(int carId) {
        for (ParkingLot parkingLot : commonParkingLots) {
            if (parkingLot.isHandicapLot() && parkingLot.parkIn(carId)) {
                return true;
            }
        }
        return false;
    }
}