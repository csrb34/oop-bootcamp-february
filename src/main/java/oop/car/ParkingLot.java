package oop.car;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    public static final double MAX_CAPACITY_PERCENTAGE = 0.8;
    public static final double NOTIFY_CAPACITY_PERCENTAGE = 0.75;
    private final int maxCapacity;
    private final int notifyCapacityThreshold;
    private final List<Integer> parkedCars;
    private final ParkingListener parkingListener;
    private final String parkingName;

    public ParkingLot(int numberOfSpaces, ParkingListener parkingListener, String parkingName) {
        this.parkingListener = parkingListener;
        this.parkingName = parkingName;
        this.parkedCars = new ArrayList<>(numberOfSpaces);
        this.maxCapacity = (int) (MAX_CAPACITY_PERCENTAGE * numberOfSpaces);
        this.notifyCapacityThreshold = (int) (NOTIFY_CAPACITY_PERCENTAGE * numberOfSpaces);
    }

    public boolean parkCar(int carId) {
        if (parkedCars.size() >= notifyCapacityThreshold) {
            parkingListener.printNotification(parkingName);
        }
        if (parkedCars.size() >= maxCapacity) {
            return false;
        }
        parkedCars.add(carId);
        return true;
    }
}
