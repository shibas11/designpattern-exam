package shibas11.DesignPattern.GoF.structual.Decorator;

/**
 * Created by SDS on 2017-06-15.
 */
public class RoadDisplayWithTraffic extends RoadDisplay {
    @Override
    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("교통량 표시");
    }
}
