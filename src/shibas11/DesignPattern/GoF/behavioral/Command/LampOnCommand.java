package shibas11.DesignPattern.GoF.behavioral.Command;

/**
 * Created by SDS on 2017-06-14.
 */
public class LampOnCommand implements Command {

    private Lamp lamp;

    public LampOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }
}
