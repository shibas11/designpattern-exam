package shibas11.DesignPattern.GoF.behavioral.Command;

/**
 * Created by SDS on 2017-06-14.
 */
public class AlarmOnCommand implements Command {

    private Alarm alarm;

    public AlarmOnCommand(Alarm alarm) {
        this.alarm = alarm;
    }

    @Override
    public void execute() {
        alarm.start();
    }
}
