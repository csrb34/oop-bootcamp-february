package oop.parking;

import java.util.List;
import java.util.Objects;

public class ParkingAssistant {

    private final List<ParkingLot> parkingLots;

    public ParkingAssistant(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public int park(Car car) {
        ParkingLot parkingLotSelected = null;
        if (car.isLarge()) {
            parkingLotSelected = searchTheLeastOccupiedParkingLot();
        } else {
            parkingLotSelected = searchTheFirstParkingLotWithEnoughCapacity();
        }
        if (!Objects.isNull(parkingLotSelected)) {
            car.park();
            parkingLotSelected.fillSpot();
            return parkingLotSelected.getId();
        }
        return -1;
    }



    private boolean hasEnoughCapacity(ParkingLot parkingLot) {
        return parkingLot.calculateOccupancyPercentage() < 0.8;
    }

    private ParkingLot searchTheLeastOccupiedParkingLot() {
        double percentageOccupancy = 1;
        ParkingLot parkingLotSelected = null;
        for (ParkingLot lot : parkingLots) {
            if (hasEnoughCapacity(lot) && lot.calculateOccupancyPercentage() < percentageOccupancy) {
                percentageOccupancy = lot.calculateOccupancyPercentage();
                parkingLotSelected = lot;
            }
        }
        return parkingLotSelected;
    }

    private ParkingLot searchTheFirstParkingLotWithEnoughCapacity() {
        return parkingLots.stream()
                .filter(this::hasEnoughCapacity)
                .findFirst().orElse(null);
    }


}
