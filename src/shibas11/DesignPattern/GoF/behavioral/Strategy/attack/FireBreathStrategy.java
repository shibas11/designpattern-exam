package shibas11.DesignPattern.GoF.behavioral.Strategy.attack;

public class FireBreathStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("fire breath!");
    }
}
