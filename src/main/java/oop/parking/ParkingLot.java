package oop.parking;

public class ParkingLot {
    private final int id;
    private final int totalCapacity;
    private int freeSpots;
    private final NotificationSender notificationSender;

    public ParkingLot(int id,
                      int totalCapacity,
                      int freeSpots,
                      NotificationSender notificationSender) {
        this.id = id;
        this.totalCapacity = totalCapacity;
        this.freeSpots = freeSpots;
        this.notificationSender = notificationSender;
    }

    public double getAvailabilityPercentage() {
        return (double) freeSpots / totalCapacity;
    }

    public void fillSpot() {
        freeSpots -= 1;
        if (getAvailabilityPercentage() < 0.25) {
            notificationSender.notifyOverUsed(id);
        }
    }

    public int getId() {
        return id;
    }
}
