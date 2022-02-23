package oop.parking;

public class ParkingLot {
    private final int id;
    private final int totalCapacity;
    private int freeSpots;

    public ParkingLot(int id, int totalCapacity, int freeSpots) {
        this.id = id;
        this.totalCapacity = totalCapacity;
        this.freeSpots = freeSpots;
    }

    public double getAvailabilityPercentage() {
        return (double) freeSpots / totalCapacity;
    }

    public void fillSpot() {
        freeSpots -= 1;
    }

    public int getId() {
        return id;
    }
}
