package oop.parking;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingAssistant {

    private List<Integer> parkingLotsFreeSpots;

    public ParkingAssistant(List<Integer> parkingLotsFreeSpots) {
        this.parkingLotsFreeSpots = parkingLotsFreeSpots;
    }

    public void park(Car car) {
        AtomicInteger parkingLot = new AtomicInteger(-1);
        var space = parkingLotsFreeSpots.stream()
                .peek(x -> parkingLot.getAndIncrement())
                .filter(lot -> lot > 0)
                .findFirst();
        if (space.isPresent()) {
            car.park();
            parkingLotsFreeSpots.set(parkingLot.get(), space.get()-1);
        }
    }

    public List<Integer> getParkingLotsFreeSpots() {
        return parkingLotsFreeSpots;
    }

}
