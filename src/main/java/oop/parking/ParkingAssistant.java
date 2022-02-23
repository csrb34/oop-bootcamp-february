package oop.parking;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingAssistant {

    private final List<Integer> parkingLotsFreeSpots;
    private final List<Integer> parkingInitialCapacity;


    public ParkingAssistant(List<Integer> parkingLotsFreeSpots, List<Integer> parkingInitialCapacity) {
        this.parkingLotsFreeSpots = parkingLotsFreeSpots;
        this.parkingInitialCapacity = parkingInitialCapacity;
    }

    public void park(Car car) {
        var parkingLotIndex = new AtomicInteger(-1);
        var space = parkingLotsFreeSpots.stream()
            .peek(x -> parkingLotIndex.getAndIncrement())
            .filter(availableSpotsForLot -> hasCapacity(availableSpotsForLot, parkingLotIndex))
            .findFirst();
        if (space.isPresent()) {
            car.park();
            parkingLotsFreeSpots.set(parkingLotIndex.get(), space.get() - 1);
        }
    }

    private boolean hasCapacity(Integer availableSpotsForLot, AtomicInteger parkingLotIndex) {
        var initialLotCapacity = parkingInitialCapacity.get(parkingLotIndex.get());
        final var availabilityPercentage = availableSpotsForLot.doubleValue() / initialLotCapacity.doubleValue();
        return availabilityPercentage >= 0.2;

    }

    public List<Integer> getParkingLotsFreeSpots() {
        return parkingLotsFreeSpots;
    }

}
