package shibas11.DesignPattern.GoF.behavioral.Strategy.attack;

/**
 * Created by shiba on 2017-06-11.
 */
public class WaterBombStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("water bomb!");
    }
}
