package shibas11.DesignPattern.GoF.behavioral.Strategy.attack;

public class OneMillionVoltsThunderStrategy implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("one million volts thunder!");
    }
}
