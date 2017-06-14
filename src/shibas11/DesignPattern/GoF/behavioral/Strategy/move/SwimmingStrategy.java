package shibas11.DesignPattern.GoF.behavioral.Strategy.move;

/**
 * Created by shiba on 2017-06-11.
 */
public class SwimmingStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("swim!");
    }
}
