package shibas11.DesignPattern.SOLID.DIP;

/**
 * Created by shiba on 2017-06-10.
 */
public class X2Adder implements IAdder {
    @Override
    public double add(double d1, double d2) {
        return (d1 + d2) * 2;
    }
}
