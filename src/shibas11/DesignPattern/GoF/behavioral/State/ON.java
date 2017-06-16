package shibas11.DesignPattern.GoF.behavioral.State;

public class ON implements State {

    private static ON on = new ON();

    private ON() {
    }

    public static ON getInstance() {
        return on;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("취침등 상태");
        light.setState(SLEEPING.getInstance());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off");
        light.setState(OFF.getInstance());
    }
}
