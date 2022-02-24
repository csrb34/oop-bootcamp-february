package oop.car;

import java.util.ArrayList;
import java.util.List;

public class ParkingAssistantManager extends ParkingAssistant {


    private List<ParkingAssistant> assistantsList;

    public ParkingAssistantManager(List<ParkingLot> commonParkingLotList, boolean certified) {
        super(commonParkingLotList, certified);
        this.assistantsList = new ArrayList<>();
    }

    public List<ParkingAssistant> getAssistantsList() {
        return assistantsList;
    }

    public void hire(List<ParkingLot> parkingLots, boolean certified) {
        this.assistantsList.add(new ParkingAssistant(parkingLots, certified));
    }
}
