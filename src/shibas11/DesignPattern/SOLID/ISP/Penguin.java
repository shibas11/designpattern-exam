package shibas11.DesignPattern.SOLID.ISP;

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
