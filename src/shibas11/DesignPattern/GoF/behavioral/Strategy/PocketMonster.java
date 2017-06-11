package shibas11.DesignPattern.GoF.behavioral.Strategy;

import shibas11.DesignPattern.GoF.behavioral.Strategy.attack.AttackStrategy;
import shibas11.DesignPattern.GoF.behavioral.Strategy.move.MovingStrategy;

/**
 * Created by shiba on 2017-06-11.
 */
public class PocketMonster {
    private String name;
    private MovingStrategy movingStrategy;
    private AttackStrategy attackStrategy;

    public PocketMonster(String name) {
        this.name = name;
    }

    public void move() {
        System.out.print(this.getName() + ": ");
        this.movingStrategy.move();
    }

    public void attack() {
        System.out.print(this.getName() + ": ");
        this.attackStrategy.attack();
    }

    public String getName() {
        return name;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy) {
        this.movingStrategy = movingStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }
}
