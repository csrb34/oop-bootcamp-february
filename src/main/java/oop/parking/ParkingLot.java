package oop.parking;

public class ParkingLot {
    private final int id;
    private final int totalCapacity;
    private int occupiedSpots;
    private boolean handicappedSpot;

    private final NotificationSender notificationSender;

    public ParkingLot(int id,
                      int totalCapacity,
                      int occupiedSpots,
                      NotificationSender notificationSender) {
        this.id = id;
        this.totalCapacity = totalCapacity;
        this.occupiedSpots = occupiedSpots;
        this.notificationSender = notificationSender;
        this.handicappedSpot = false;
    }

    public ParkingLot(int id,
                      int totalCapacity,
                      int occupiedSpots,
                      NotificationSender notificationSender,
                      boolean handicappedSpot) {
        this(id, totalCapacity, occupiedSpots, notificationSender);
        this.handicappedSpot = handicappedSpot;
    }

    public double calculateOccupancyPercentage() {
        return (double) occupiedSpots / totalCapacity;
    }

    public void fillSpot() {
        occupiedSpots += 1;
        if (calculateOccupancyPercentage() >= 0.75) {
            notificationSender.notifyOverUsed(id);
        }
        if (calculateOccupancyPercentage() <= 0.20) {
            notificationSender.notifyMisused(id);
        }
    }

    public int getId() {
        return id;
    }

    public boolean isThereHandicappedSpot() {
        return handicappedSpot;
    }

}
