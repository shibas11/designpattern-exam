package shibas11.DesignPattern.GoF.behavioral.Strategy;

/**
 * Created by shiba on 2017-06-11.
 */
public abstract class PocketMonster {
    private String name;

    public PocketMonster(String name) {
        this.name = name;
    }

    public abstract void move();

    public abstract void attack();

    public String getName() {
        return name;
    }

}
