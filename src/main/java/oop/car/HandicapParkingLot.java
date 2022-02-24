package oop.car;

public class HandicapParkingLot extends ParkingLot {

    public HandicapParkingLot(int numberOfSpaces, ParkingListener parkingListener, String parkingName) {
        super(numberOfSpaces, parkingListener, parkingName);
    }

    @Override
    protected boolean isHandicapLot() {
        return true;
    }

}
