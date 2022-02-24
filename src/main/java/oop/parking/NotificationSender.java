package oop.parking;

public class NotificationSender {
    public void notifyOverUsed(int parkingLotId) {
        System.out.println("ParkingLot %s is over 75% capacity");
    }

    public void notifyMisused(int parkingLotId) {
    }
}
