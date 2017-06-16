package shibas11.DesignPattern.GoF.structual.Decorator;

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
