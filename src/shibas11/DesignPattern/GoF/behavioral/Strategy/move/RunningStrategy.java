package shibas11.DesignPattern.GoF.behavioral.Strategy.move;

public class RunningStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("run!");
    }
}
