package shibas11.DesignPattern.SOLID.ISP;

/**
 * Created by shiba on 2017-06-11.
 */
public class Penguin implements Bird {
    @Override
    public void sing() {
        System.out.println("penguin penguin");
    }

    @Override
    public void eat() {
        System.out.println("eat eat");
    }
}
