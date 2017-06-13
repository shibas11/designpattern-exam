package shibas11.DesignPattern.GoF.behavioral.State;

/**
 * Created by shiba on 2017-06-14.
 */
public interface State {
    void on_button_pushed(Light light);

    void off_button_pushed(Light light);
}
