package shibas11.DesignPattern.GoF.behavioral.Strategy;

import shibas11.DesignPattern.GoF.behavioral.Strategy.PocketMonster;

/**
 * Created by shiba on 2017-06-11.
 */
public class WaterMon extends PocketMonster {
    public WaterMon(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + ": swim!");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + ": water bomb!");
    }
}
