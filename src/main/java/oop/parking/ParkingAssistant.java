package oop.parking;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingAssistant {

    private final List<ParkingLot> parkingLots;

    public ParkingAssistant(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public int park(Car car) {
        return parkingLots.stream()
            .filter(this::hasCapacity)
            .findFirst().map(parkingLot -> {
                car.park();
                parkingLot.fillSpot();
                return parkingLot.getId();
            }).orElse(-1);
    }

    private boolean hasCapacity(ParkingLot parkingLot) {
        return parkingLot.getAvailabilityPercentage() >= 0.2;
    }

}
