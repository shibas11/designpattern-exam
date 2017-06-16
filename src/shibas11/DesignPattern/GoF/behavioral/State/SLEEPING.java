package shibas11.DesignPattern.GoF.behavioral.State;

public class SLEEPING implements State {

    private static SLEEPING sleeping = new SLEEPING();

    private SLEEPING() {
    }

    public static State getInstance() {
        return sleeping;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println(("Light ON"));
        light.setState(ON.getInstance());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println(("Light OFF"));
        light.setState(OFF.getInstance());
    }
}
