package shibas11.DesignPattern.SOLID.DIP;

public class X2Adder implements IAdder {
    @Override
    public double add(double d1, double d2) {
        return (d1 + d2) * 2;
    }
}
