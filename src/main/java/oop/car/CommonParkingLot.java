package oop.car;

public class CommonParkingLot extends ParkingLot {

    public CommonParkingLot(int numberOfSpaces, ParkingListener parkingListener, String parkingName) {
        super(numberOfSpaces, parkingListener, parkingName);
    }

    @Override
    protected boolean isHandicapLot() {
        return false;
    }

}
