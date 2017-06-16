package shibas11.DesignPattern.GoF.behavioral.Strategy.attack;

public class WaterBombStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("water bomb!");
    }
}
