package shibas11.DesignPattern.GoF.behavioral.Strategy;

/**
 * Created by shiba on 2017-06-11.
 */
public class FireMon extends PocketMonster {
    public FireMon(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(this.getName() + ": run!");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + ": fire breath!");
    }
}
