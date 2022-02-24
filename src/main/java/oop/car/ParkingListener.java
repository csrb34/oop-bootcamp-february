package oop.car;

public interface ParkingListener {
    String notifyMaxCapacity(String parkingName);
    String notifyMinCapacity(String parkingName);
}
