package shibas11.DesignPattern.GoF.behavioral.State;

/**
 * Created by shiba on 2017-06-13.
 */
public class Light {
    private State state; // 형광등 상태

    public Light() {
        state = new OFF(); // 초기상태는 OFF
    }

    public void on_button_pushed() {
        state.on_button_pushed(this);
    }

    public void off_button_pushed() {
        state.off_button_pushed(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
