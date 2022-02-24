package oop.car;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingLot {
    public static final double MAX_CAPACITY_PERCENTAGE = 0.8;
    public static final double NOTIFY_TOP_CAPACITY_PERCENTAGE = 0.75;
    public static final double NOTIFY_LOW_CAPACITY_PERCENTAGE = 0.20;
    private final int maxCapacity;
    private final int notifyTopCapacityThreshold;
    private final int notifyLowCapacityThreshold;
    private final List<Integer> parkedCars;
    private final ParkingListener parkingListener;
    private final String parkingName;

    public ParkingLot(int numberOfSpaces, ParkingListener parkingListener, String parkingName) {
        this.parkingListener = parkingListener;
        this.parkingName = parkingName;
        this.parkedCars = new ArrayList<>(numberOfSpaces);
        this.maxCapacity = (int) (MAX_CAPACITY_PERCENTAGE * numberOfSpaces);
        this.notifyTopCapacityThreshold = (int) (NOTIFY_TOP_CAPACITY_PERCENTAGE * numberOfSpaces);
        this.notifyLowCapacityThreshold = (int) (NOTIFY_LOW_CAPACITY_PERCENTAGE * numberOfSpaces);
    }

    public boolean parkIn(int carId) {
        if (parkedCars.size() >= notifyTopCapacityThreshold) {
            parkingListener.notifyMaxCapacity(parkingName);
        }
        if (parkedCars.size() >= maxCapacity) {
            return false;
        }
        parkedCars.add(carId);
        return true;
    }

    public boolean parkOut(int cardId) {
        if (parkedCars.contains(cardId)) {
            parkedCars.remove(Integer.valueOf(cardId));
            if (parkedCars.size() < notifyLowCapacityThreshold) {
                parkingListener.notifyMinCapacity(parkingName);
            }
            return true;
        }
        return false;
    }

    public double calculateOccupancy() {
        return (double) parkedCars.size() / maxCapacity;
    }

    protected abstract boolean isHandicapLot();
}
