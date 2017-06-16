package shibas11.DesignPattern.GoF.behavioral.TemplateMethod;

public class Door {
    private DoorStatus doorStatus;

    public Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    public void close() {
        doorStatus = DoorStatus.CLOSED;
    }

    public void open() {
        doorStatus = DoorStatus.OPENED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }
}

