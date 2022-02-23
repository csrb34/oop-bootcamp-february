package oop.parking;

public class ParkingLot {
    private final int totalCapacity;
    private int freeSpots;

    public ParkingLot(int totalCapacity, int freeSpots) {
        this.totalCapacity = totalCapacity;
        this.freeSpots = freeSpots;
    }

    public double getOccupationPercentage() {
        return (double) freeSpots/totalCapacity;
    }
}
