package oop.car;

import java.util.ArrayList;
import java.util.List;
//"I (owner) want to be notified when parking lot usage is less than 20% so that I can close down some parkings"
public class ParkingLot {
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

    public boolean parkCar(int carId) {
        if (parkedCars.size() >= notifyTopCapacityThreshold) {
            parkingListener.notifyMaxCapacity(parkingName);
        }
        if (parkedCars.size() >= maxCapacity) {
            return false;
        }
        parkedCars.add(carId);
        return true;
    }
}
