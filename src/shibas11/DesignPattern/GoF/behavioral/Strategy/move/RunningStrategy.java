package shibas11.DesignPattern.GoF.behavioral.Strategy.move;

import shibas11.DesignPattern.GoF.behavioral.Strategy.move.MovingStrategy;

/**
 * Created by shiba on 2017-06-11.
 */
public class RunningStrategy implements MovingStrategy {
    @Override
    public void move() {
        System.out.println("run!");
    }
}
