package shibas11.DesignPattern.GoF.behavioral.State;

/**
 * Created by shiba on 2017-06-13.
 */
public class Light {
    private static int ON = 0;  // 형광등이 꺼진 상태
    private static int OFF = 1; // 형광등이 켜진 상태
    private int state; // 형광등 상태

    public Light() {
        state = OFF; // 초기상태는 OFF
    }

    public void on_button_pushed() {
        if(state == ON)
            System.out.println("반응 없음");
        else {
            System.out.println("Light On");
            state = ON;
        }
    }

    public void off_button_pushed() {
        if(state == OFF)
            System.out.println("반응 없음");
        else {
            System.out.println("Light Off");
            state = OFF;
        }
    }
}
