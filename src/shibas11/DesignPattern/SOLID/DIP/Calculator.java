package shibas11.DesignPattern.SOLID.DIP;

public class Calculator {
    private IAdder adder;

    public Calculator() {
        this.adder = new X2Adder();
    }

    public Calculator(IAdder adder) {
        this.adder = adder;
    }

    public double add(double d1, double d2) {
        return this.adder.add(d1, d2);
    }

    public void setAdder(IAdder adder) {
        this.adder = adder;
    }
}
