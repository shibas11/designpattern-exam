package shibas11.DesignPattern.GoF.behavioral.State;

/**
 * Created by shiba on 2017-06-14.
 */
public class ON implements State {

    public ON() {
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("반응 없음");
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off");
        light.setState(new OFF());

    }
}
