package shibas11.DesignPattern.GoF.behavioral.State;

/**
 * Created by shiba on 2017-06-14.
 */
public class OFF implements State {

    private static OFF off = new OFF();

    private OFF() {
    }

    public static OFF getInstance() {
        return off;
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On");
        light.setState(ON.getInstance());
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("반응 없음");
    }
}
