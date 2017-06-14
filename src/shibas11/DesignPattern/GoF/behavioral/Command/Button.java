package shibas11.DesignPattern.GoF.behavioral.Command;

/**
 * Created by SDS on 2017-06-14.
 */
public class Button {

    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void pressed() {
        this.command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
