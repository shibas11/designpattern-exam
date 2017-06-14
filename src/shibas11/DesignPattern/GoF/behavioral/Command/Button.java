package shibas11.DesignPattern.GoF.behavioral.Command;

/**
 * Created by SDS on 2017-06-14.
 */
public class Button {
    private Lamp lamp;

    public Button(Lamp lamp) {
        this.lamp = lamp;
    }

    public void pressed() {
        lamp.turnOn();
    }
}
