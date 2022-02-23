package oop.car;

public class Owner implements ParkingListener {

    public String printNotification(String parkingName) {
        return String.format("Parking %s full capacity", parkingName);
    }
}
