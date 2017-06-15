package shibas11.DesignPattern.GoF.structual.Decorator;

/**
 * Created by SDS on 2017-06-15.
 */
public abstract class DisplayDecorator extends Display {
    private Display display;

    public DisplayDecorator(Display display) {
        this.display = display;
    }

    @Override
    // 부모의 draw()를 사용하지 않고, display 멤버의 draw()를 사용
    public void draw() {
        display.draw();
    }
}
