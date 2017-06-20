package shibas11.DesignPattern.GoF.structual.Composite;

public class Mouse extends ComputerDevice {
    private int price;
    private int power;

    public Mouse(int price, int power) {
        this.price = price;
        this.power = power;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getPower() {
        return power;
    }
}
