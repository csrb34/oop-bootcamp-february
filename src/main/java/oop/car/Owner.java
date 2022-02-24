package oop.car;

public class Owner implements ParkingListener {

    public String notifyMaxCapacity(String parkingName) {
        return String.format("Parking %s full capacity", parkingName);
    }

    public String notifyMinCapacity(String parkingName) {
        return String.format("Parking %s almost empty", parkingName);
    }
}
