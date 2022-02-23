package oop.parkinglot;

public class Car {
    private boolean parked;

    public boolean isParked() {
        return parked;
    }

    public void park() { parked = true; }

    public void retrieve() { parked = false; }
}
