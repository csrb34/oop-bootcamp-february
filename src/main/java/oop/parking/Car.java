package oop.parking;

public class Car {
    private boolean parked;
    private String type;

    public Car() {
    }

    public Car(String type) {
        this.type = type;
    }


    public boolean isParked() {
        return parked;
    }

    public void park() {
        parked = true;
    }

    public void retrieve() {
        parked = false;
    }
    public boolean isLarge(){
        return "large" == type;
    }

    public boolean isHandicapped() {
            return "handicapped" == type;
    }
}
