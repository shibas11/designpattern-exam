package shibas11.DesignPattern.GoF.behavioral.Command;

/**
 * Created by SDS on 2017-06-14.
 */
public class Button {

    private Lamp lamp;
    private Alarm alarm;
    private ButtonMode mode;

    public Button(Lamp lamp, Alarm alarm) {
        this.lamp = lamp;
        this.alarm = alarm;
    }

    public void setMode(ButtonMode mode) {
        this.mode = mode;
    }

    public void pressed() {
        switch (mode) {
            case LAMP:
                lamp.turnOn();
                break;
            case ALARM:
                alarm.start();
                break;
        }
    }
}

;
