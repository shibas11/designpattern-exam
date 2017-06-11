package shibas11.DesignPattern.GoF.behavioral.Strategy.attack;

import shibas11.DesignPattern.GoF.behavioral.Strategy.attack.AttackStrategy;

/**
 * Created by shiba on 2017-06-11.
 */
public class FireBreathStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("fire breath!");
    }
}
