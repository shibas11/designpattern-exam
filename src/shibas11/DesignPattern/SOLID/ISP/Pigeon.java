package shibas11.DesignPattern.SOLID.ISP;

/**
 * Created by shiba on 2017-06-11.
 */
public class Pigeon implements Bird, Flyable {
    @Override
    public void sing() {
        System.out.println("coo coo coo coo");
    }

    @Override
    public void eat() {
        System.out.println("eat eat");
    }

    @Override
    public void fly() {
        System.out.println("fly!");
    }
}
