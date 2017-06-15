package shibas11.DesignPattern.GoF.structual.Decorator;

/**
 * Created by SDS on 2017-06-15.
 */
public class LaneDecorator extends DisplayDecorator {

    public LaneDecorator(Display display) {
        super(display);
    }

    @Override
    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("차선 표시");
    }
}
