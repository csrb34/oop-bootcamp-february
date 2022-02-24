package oop.parking;

import java.util.List;

public class ParkingAssistant {

    private final List<ParkingLot> parkingLots;

    public ParkingAssistant(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public int park(Car car) {
        return parkingLots.stream()
            .filter(this::hasEnoughCapacity)
            .findFirst().map(parkingLot -> {
                car.park();
                parkingLot.fillSpot();
                return parkingLot.getId();
            }).orElse(-1);
    }

    private boolean hasEnoughCapacity(ParkingLot parkingLot) {
        return parkingLot.calculateOccupancyPercentage() < 0.8;
    }

}
