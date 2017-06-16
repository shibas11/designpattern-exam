package shibas11.DesignPattern.GoF.creational.FactoryMethod;

public class ElevatorController {
    private int id;
    private int curFloor;

    public ElevatorController(int id) {
        this.id = id;
        curFloor = 1;
    }

    public void gotFloor(int destination) {
        System.out.print("Elevator [" + id + "] Floor: " + curFloor);

        // 현재 층 갱신, 즉 목적지로 엘리베이터가 이동함
        curFloor = destination;
        System.out.println(" ==> " + curFloor);
    }
}
