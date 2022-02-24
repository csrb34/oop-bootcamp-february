package oop.parking;

import java.util.List;
import java.util.Objects;

public class ParkingAssistant {

    private final List<ParkingLot> parkingLots;

    public ParkingAssistant(List<ParkingLot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public int park(Car car) {
        if (car.isLarge()) {
            var parkingLotSelected = searchTheLeastOccupiedParkingLot();
            if(!Objects.isNull(parkingLotSelected)){
                car.park();
                return parkingLotSelected.getId();
            }
            return -1;
        }

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

    public ParkingLot searchTheLeastOccupiedParkingLot() {
        var percentageOccupancy = 1;
        ParkingLot parkingLotSelected = null;
        for (ParkingLot lot : parkingLots) {
            if (hasEnoughCapacity(lot) && lot.calculateOccupancyPercentage() < percentageOccupancy) {
                parkingLotSelected = lot;
            }
        }
        return parkingLotSelected;
    }



}
