package shibas11.DesignPattern.SOLID.DIP;

/**
 * Created by shiba on 2017-06-10.
 */
public class Calculator {
    private Adder adder;

    public Calculator() {
        this.adder = new Adder();
    }

    public double add(double d1, double d2) {
        return this.adder.add(d1, d2);
    }
}
